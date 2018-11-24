package com.blingbling.boot1805.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_student")
public class QfWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 10)
    private String name;
    @Column(length = 20)
    private String city;
    @Column
    private double price;

    public QfWork() {}

    public QfWork(int id, String name, String city, double price) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "QfWork{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }
}
