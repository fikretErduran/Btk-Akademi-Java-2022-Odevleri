package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate veritabanina eklendi Category"+" "+ category.getCategoryName());
		
	}
	

}
