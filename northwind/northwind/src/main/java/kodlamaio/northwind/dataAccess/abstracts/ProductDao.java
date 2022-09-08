package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	// interface interfaceyi extends eder bu yüzden JpaRepository'i extends ediyoruz
	// JpaRepository verdiğim veri tipi için Entity anatasyonuyla süslenmiş nesne
	// için
	// kısacası product için primaryKey anahtarınıda ver ki ben sorguları ona göre
	// hazırlayalım
	// primaryKey'im de integer olduğundan nesne Product,primaryKey Integer
	// belirtilir.

	// güncelleme ekleme silme işlemleri de yapılacak
	// bunun için businnes içinde ProductService işlemine gerekli düzenlemeler
	// yapılır.
}