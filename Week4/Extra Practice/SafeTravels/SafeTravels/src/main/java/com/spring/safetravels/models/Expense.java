package com.spring.safetravels.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name="expense")
public class Expense {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 2, max = 200, message="Please Fill out Blanks")
	    private String name;
	    
	    @NotNull
	    @Size(min = 2, max = 200, message="Please Fill out Blanks")
	    private String vendor;
	    
	    @NotNull(message="Please Fill out Blanks")
	    @Min(value = 0, message="Amount cannot be zero")
	    private Double amount;
	    
	    @NotNull
	    @Size(min = 2, max = 300, message="Please Fill out Blanks")
	    private String description;

		public Expense() {}
		public Expense(String name, String vendor, Double amount, String description) {
			this.name = name;
			this.vendor = vendor;
			this.amount = amount;
			this.description = description;
		}
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVendor() {
			return vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	    
}
