package food.delivery.work;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Promote_table")
public class Promote {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String phoneNo;
    private String username;
    private Long orderId;
    private String orderStatus;
    private String productId;
    private String payStatus;
    private String couponId;
    private String couponKind;
    private String couponUseYn;
    private String userId;

    @PostPersist
    public void onPostPersist(){
    	if(this.couponId == "" || this.couponId == null) {
	        CouponPublished couponPublished = new CouponPublished();
	        BeanUtils.copyProperties(this, couponPublished);
	        couponPublished.publishAfterCommit();
    		
    	}else {
	        CouponPublished couponPublished = new CouponPublished();
	        BeanUtils.copyProperties(this, couponPublished);
	        couponPublished.publishAfterCommit();
    	}

    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCouponKind() {
		return couponKind;
	}

	public void setCouponKind(String couponKind) {
		this.couponKind = couponKind;
	}

	public String getCouponUseYn() {
		return couponUseYn;
	}

	public void setCouponUseYn(String couponUseYn) {
		this.couponUseYn = couponUseYn;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}



}