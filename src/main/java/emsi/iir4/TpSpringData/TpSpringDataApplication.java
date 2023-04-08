package emsi.iir4.TpSpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import emsi.iir4.TpSpringData.DAO.ProduitRepository;
import emsi.iir4.TpSpringData.Entities.Produit;

@SpringBootApplication
public class TpSpringDataApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(TpSpringDataApplication.class, args);
	ProduitRepository pr = ctx.getBean(ProduitRepository.class );
	
	//Ajout
	pr.save(new Produit(null,"USB Kingston",150,12));
	pr.save(new Produit(null,"USB Sony",150,12));
	pr.save(new Produit(null,"Clavier",150,12));
	pr.save(new Produit(null,"Ecran",150,12));
	
	//modification
	pr.save(new Produit(3,"disque dure ssd",150,12));
	
	
	//pr.ChercherParMc("USB").forEach(p->System.out.println(p));
	pr.findByDesignationContains("USB").forEach(p->System.out.println(p));
	
	}

	
	
	
}
