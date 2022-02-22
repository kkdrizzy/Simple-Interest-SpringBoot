package com.example.SimpleInterest.ModelDAO;

import javax.persistence.*;

@Entity
@Table(name = "interest_variable")
public class InterestVariable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "principal")
    private Long principal;

    @Column(name = "rate_of_interest")
    private Long rateOfInterest;

    @Column(name = "duration")
    private Long duration;

    @Column(name = "simple_interest")
    private Long simpleInterest;

    @Column(name = "total_amount")
    private Long totalAmount;

    public InterestVariable() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    public Long getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Long rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getSimpleInterest() {
        return simpleInterest;
    }

    public void setSimpleInterest(Long simpleInterest) {
        this.simpleInterest = simpleInterest;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }
}
