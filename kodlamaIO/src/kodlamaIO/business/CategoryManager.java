package kodlamaIO.business;


import java.util.ArrayList;

import kodlamaIO.Loggers.Logger;
import kodlamaIO.dataAccess.ICategoryDao;
import kodlamaIO.entities.Category;

public class CategoryManager {
	
	private ICategoryDao _iCategoryDao;
	private Logger[] loggers;
	private ArrayList<Category> categoryList =new ArrayList<>();
	
	
	
	
	
	
	public CategoryManager(ICategoryDao iCategoryDao,Logger [] loggers) {
		
		this._iCategoryDao = iCategoryDao;
		this.loggers=loggers;
		
		
		
	}


	public void add(Category category) throws Exception  {
		for(Category c:categoryList) {
			if(category.getCategoryName()==c.getCategoryName()){
				throw new Exception("Category adı tekrar edilemez");
				
			}
		}
		_iCategoryDao.add(category);
		categoryList.add(category);
	
	    
	   
	    for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
	
	

}
