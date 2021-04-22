package com.sijan.router;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.sijan.model.Product;
import com.sijan.service.ProductService;

@Path("/products")
public class ProductRouter {
	
	private ProductService productService = new ProductService();
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> listAllProducts(){
		return productService.getAllProducts();
	}
	
	@POST
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createProduct(Product product) {
		if(product.getName() == null) 
			return Response.status(Status.BAD_REQUEST).entity("Name is necessary").build();
		
		productService.insertProduct(product);
		return Response.status(Status.CREATED).entity(product).build();
	}
	
}
