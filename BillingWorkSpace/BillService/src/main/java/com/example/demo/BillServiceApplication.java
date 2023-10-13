package com.example.demo;

import com.example.demo.beans.CustomerBean;
import com.example.demo.beans.ProductBean;
import com.example.demo.model.Bill;
import com.example.demo.proxies.CustomerServiceProxy;
import com.example.demo.proxies.InventoryServiceProxy;
import com.example.demo.repository.BillRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Date;


@EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@AllArgsConstructor


public class BillServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BillServiceApplication.class, args);
	}

	CustomerServiceProxy CustomerProxy;
	InventoryServiceProxy  InventoryProxy;
	BillRepository billRepository;

	@Override
	public void run(String... args) throws Exception {

		CustomerBean bean = CustomerProxy.findCustomerById(1l);
		System.out.println(bean.getName());

		//Question 2
		Bill bill =new Bill();
		bill.setBillingdate(new Date());
		bill.setCustomerID(1L);
		bill.setCustomerID(bean);
		billRepository.save(bill);

		ProductBean p1= InventoryProxy.findProductById(1L);
		ProductBean p2= InventoryProxy.findProductById(1L);
		ProductBean p3= InventoryProxy.findProductById(1L);

		System.out.println(p1.getId()+ " " + p1.getName());
		System.out.println(p2.getId()+ " " + p1.getName());
		System.out.println(p3.getId()+ " " + p1.getName());






		// Question 3
				
				
		//Question 4
		
	}

}
