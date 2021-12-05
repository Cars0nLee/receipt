package com.cl.receipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ReceiptController {
	@RequestMapping("/")
	public String receipt(Model info) {
	    String name = "Grace Hopper (Grass Hopper)";
	    String itemName = "Copper wire";
	    double price = 5.25;
	    String description = "Metal strips, also an illustration of nanoseconds.";
	    String vendor = "Little Things Corner Store";
	    
	    info.addAttribute("name", name);
	    info.addAttribute("item", itemName);
	    info.addAttribute("price", price);
	    info.addAttribute("description", description);
	    info.addAttribute("vendor", vendor);
	    
	    return "index.jsp";
	}
}


