package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@CrossOrigin("http://127.0.0.1:5500")
public class PillController {
	private static final ArrayList<History> History = null;

	@Autowired
	UserManager umanager;
	
	  @Autowired HistoryManager hmanager;
	  
	  @Autowired DependentManager dmanager;
	 
	
	@PostMapping(value = "api/auser")	
	
	 public void addUser(@RequestBody User u) {
	 
		 umanager.addUser(u); 
		 
	}
	
	@PutMapping(value = "api/puser")	
	
	 public void putUser(@RequestBody User u) {
	 
		 umanager.putUser(u); 
	}
	 
	@GetMapping(value = "api/guser/{email}")
	public User getUser(@PathVariable String email) {
		 
		 
		return umanager.getUserbyMail(email); 
		
	 }
	@GetMapping(value = "api/gdependent/{email}/{relationship}")
	public Dependent getDependent(@PathVariable String email,@PathVariable String relationship) {
		 
		System.out.println(dmanager.getDependent(email,relationship));
		return dmanager.getDependent(email,relationship); 
		
	 }
	@PostMapping(value = "api/ahistory/{email}/{relationship}")
	public ArrayList<History> addHistory(@PathVariable String email,@PathVariable String relationship,@RequestBody History h)
	 {
		if(dmanager.getDependent(email,relationship)!=null) {
		Integer i1=(dmanager.getDependent(email,relationship)).getId();
		h.setDid(i1);
		System.out.println("inside add hostorytryryytryfyfthfhfh");
		System.out.println(h);
		 hmanager.addHistory(h);
		 System.out.println((ArrayList<History>) hmanager.getHistory(i1));
		 return (ArrayList<History>) hmanager.getHistory(i1);
		}
		else		{	
			
			ArrayList<History> h1=new ArrayList<History>();
			History h2=new History();
			h2.setHisid(-1);
			h1.add(h2);
		return h1;
		
		
		}
		
	 }
	
	@GetMapping(value = "api/ghistory/{email}/{relationship}")
	public ArrayList<History> getHistory(@PathVariable String email,@PathVariable String relationship) {
		System.out.println("reached");
		Integer i1;
		if(dmanager.getDependent(email,relationship)!=null)
		i1=(dmanager.getDependent(email,relationship)).getId();
		else 
			return null;
		
		
		
		return (ArrayList<History>) hmanager.getHistory(i1);
	
		
		
		
	}
	
	
	
	
	
	
	
@GetMapping(value = "api/ghistory/{email}")
	public HomeHistory getHistory(@PathVariable String email) {	

	HomeHistory hh=new HomeHistory();		
	if(dmanager.getDependent(email,"dad")!=null)
	{
		Integer i1=(dmanager.getDependent(email,"dad")).getId();
		hh.setDad((ArrayList<com.example.demo.History>) hmanager.getHistory(i1));
		
		
	}
	else {
		hh.setDad(null);
	}
	if(dmanager.getDependent(email,"mom")!=null)
	{
		Integer i2=(dmanager.getDependent(email,"mom")).getId();
		hh.setMom((ArrayList<com.example.demo.History>) hmanager.getHistory(i2));
		
		
	}
	else {
		hh.setMom(null);
	}
	if(dmanager.getDependent(email,"self")!=null)
	{
		Integer i3=(dmanager.getDependent(email,"self")).getId();
		hh.setSelf((ArrayList<com.example.demo.History>) hmanager.getHistory(i3));
		
		
	}
	else {
		hh.setSelf(null);
	}
		 
		return hh;
	 }




	@PostMapping(value = "api/adependent")
	public void addDependent(@RequestBody Dependent d)
	 {
		System.out.println("reached");
		System.out.println(d);
		if(dmanager.getDependent(d.getPemail(),d.getRelationship())==null)
		 dmanager.addDependent(d); 
		else {
			d.setId(getDependent(d.getPemail(),d.getRelationship()).getId());
			
			
			dmanager.updateDependent(d);
			
			
			
		}
		
	 }

}
