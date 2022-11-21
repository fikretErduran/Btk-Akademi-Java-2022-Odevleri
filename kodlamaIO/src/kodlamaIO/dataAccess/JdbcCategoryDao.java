package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veri tabanina eklendi "+" "+category.getCategoryName()+"Kategory"+category.getId());
		
	}

}
