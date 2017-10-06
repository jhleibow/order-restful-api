package com.lebo.orderApplication;


import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


@XmlRootElement(name="item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    @XmlAttribute
    private int id;

    @XmlElement
    private BigDecimal cost;

    @XmlElement
    private String name;

    @XmlElement
    private BigDecimal count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }
}