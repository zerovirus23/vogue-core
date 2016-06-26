package co.zero.vogue.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by htenjo on 6/8/16.
 */
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task extends BaseEntity{

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdDate;

    @ManyToOne
    private Employee responsible;

    @ManyToOne
    private Event event;

    private double percentageCompleted;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date expectedClosedDate;

    private String closedComments;


    public Employee getResponsible() {
        return responsible;
    }

    public void setResponsible(Employee responsible) {
        this.responsible = responsible;
    }

    public double getPercentageCompleted() {
        return percentageCompleted;
    }

    public void setPercentageCompleted(double percentageCompleted) {
        this.percentageCompleted = percentageCompleted;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getExpectedClosedDate() {
        return expectedClosedDate;
    }

    public void setExpectedClosedDate(Date expectedClosedDate) {
        this.expectedClosedDate = expectedClosedDate;
    }

    public String getClosedComments() {
        return closedComments;
    }

    public void setClosedComments(String closedComments) {
        this.closedComments = closedComments;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}