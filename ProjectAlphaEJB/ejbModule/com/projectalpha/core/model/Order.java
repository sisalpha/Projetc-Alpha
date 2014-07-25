package com.projectalpha.core.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "core_order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date dateAdded;
	
	@Temporal(TemporalType.DATE)
	private Date dateLastModified;
	
	private float discount;
	private float tax;
	private float subTotal;
	private float total;
	
	@ManyToOne(optional=false) 
	@JoinColumn(name="status_id")
	private StatusOrder status;
	
	@ManyToOne
	@JoinColumn(name="coupon_id")
	private Coupon coupon;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="ecommerce_id")
	private Ecommerce ecommerce;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="paymentethod_id")
	private PaymentMethod paymentMethod;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="paymentstatus_id")
	private PaymentStatus paymentStatus;
	
	@ManyToMany
	@JoinTable(name="core_order_product",
	joinColumns=@JoinColumn(name="order_id"),
	inverseJoinColumns=@JoinColumn(name="product_id"))
	private Collection<Product> products;
	
	@ManyToMany
	@JoinTable(name="core_order_history",
	joinColumns=@JoinColumn(name="order_id"),
	inverseJoinColumns=@JoinColumn(name="history_id"))
	private Collection<History> history;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public StatusOrder getStatus() {
		return status;
	}

	public void setStatus(StatusOrder status) {
		this.status = status;
	}

	public Collection<History> getHistory() {
		return history;
	}

	public void setHistory(Collection<History> history) {
		this.history = history;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Ecommerce getEcommerce() {
		return ecommerce;
	}

	public void setEcommerce(Ecommerce ecommerce) {
		this.ecommerce = ecommerce;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
