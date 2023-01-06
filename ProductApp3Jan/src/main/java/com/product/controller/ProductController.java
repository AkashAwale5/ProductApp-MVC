package com.product.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.product.dao.ProductDao;
import com.product.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDao productdao;

	@RequestMapping("/")
	public String myindex(Model m) {
		List<Product> all = productdao.getAll();
		m.addAttribute("products", all);

		return "index";
	}

	// add product
	@RequestMapping("/addproduct")
	public String addProduct(Model m, Product product) {

		return "addProduct";
	}

	// save
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView viewProduct(@ModelAttribute Product product, HttpServletRequest httpServletRequest) {
		RedirectView rv = new RedirectView();
		rv.setUrl(httpServletRequest.getContextPath() + "/");
		productdao.saveUser(product);
		return rv;
	}

	// delete
	@RequestMapping("/deletehandler/{id}")
	public RedirectView vdelete(HttpServletRequest httpServletRequest, @PathVariable("id") int id) {
		productdao.deleteSingle(id);
		RedirectView rv = new RedirectView();
		rv.setUrl(httpServletRequest.getContextPath() + "/");
		return rv;
	}

	// update
//	@RequestMapping("/update/{id}")
//	public String updateForm(@PathVariable("id") int id, Model model) 
//	{
//		Product product = productdao.getSingle(id);
//		model.addAttribute("product", product);
//		
//		return "updateproduct";
//	}
	@RequestMapping(value="/update/{id}")
	public String edit1(@PathVariable int id )
	{
		  return "redirect:/editi?id="+id;		 
	}
	@RequestMapping("/editi")
	public String edit2(@RequestParam("id") int id,Model  model)
	{ 
		Product product = productdao.getSingle(id);
		System.out.println("get report");
		System.out.println(product.getProdName());
		model.addAttribute("product", product);

		return "updateproduct";
	}

	@RequestMapping("/new")
	public String newFile() {
		return "updateproduct";
	}

}
