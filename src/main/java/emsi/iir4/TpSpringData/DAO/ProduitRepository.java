package emsi.iir4.TpSpringData.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import emsi.iir4.TpSpringData.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Integer>{

	@Query("select p from Produit p where p.designation like %:x%")	
	List<Produit> ChercherParMc(@Param("x")String Mc); 


	List<Produit> findByDesignationContains(String Mc);

}
