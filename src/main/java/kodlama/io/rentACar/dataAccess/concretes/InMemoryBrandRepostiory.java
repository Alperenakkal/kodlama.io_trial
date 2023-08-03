package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
@Repository //bu sınıf bir DataAccess nesnesidir
public class InMemoryBrandRepostiory implements BrandRepository{
	List<Brand> brands;
	
	public InMemoryBrandRepostiory() {
		brands=new ArrayList<Brand>();
		brands.add(new Brand("Bmw",1));
		brands.add(new Brand("Fiat",2));
		brands.add(new Brand("Honda",3));
		brands.add(new Brand("Mercedes",4));
		brands.add(new Brand("Wolsvagen",5));
		brands.add(new Brand("Opel",6));
		
		
		
		
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
