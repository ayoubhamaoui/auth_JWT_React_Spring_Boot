package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CUBE_INVOICE_IMPAYE")
public class CubeInvoiceImpaye {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NOBILL", nullable = true, length = 20)
    private String nobill;

    @Column(name = "NOUNITE", nullable = true, length = 255)
    private String nounite;

    @Column(name = "CODEDECLARANT", nullable = true, length = 20)
    private String codedeclarant;

    @Column(name = "DESIGNATION", nullable = true, length = 255)
    private String designation;

    @Column(name = "ICE", nullable = true, length = 20)
    private String ice;

    @Column(name = "MNTE", nullable = true, precision=19, scale=2,columnDefinition="NUMBER(19,2)")
    private Double mnte;

    @Column(name = "DATEBILL", nullable = true)
    private Timestamp datebill;

    @Column(name = "DELAIPAY", nullable = true, length = 255)
    private String delaipay;

    @Column(name = "DATEECHEANCE", nullable = true)
    private Timestamp dateechange;

    @Column(name = "MNTM", nullable = true, precision=19, scale=2,columnDefinition="NUMBER(19,2)")
    private Double mntm;

    @Column(name = "MNTPAYD", nullable = true, precision=19, scale=2,columnDefinition="NUMBER(19,2)")
    private Double mntmpayd;

    @Column(name = "DATEPAY", nullable = true)
    private Timestamp datepay;

    @Column(name = "DEVISE", nullable = true, length = 20)
    private String devise;

    @Column(name = "TXCHANGE", nullable = true, precision=19, scale=2,columnDefinition="NUMBER(19,2)")
    private Double txchange;



    //constructor

    public CubeInvoiceImpaye() {
    }

    public CubeInvoiceImpaye(String nobill, String nounite, String codedeclarant, String designation, String ice, Double mnte, Timestamp datebill, String delaipay, Timestamp dateechange, Double mntm, Double mntmpayd, Timestamp datepay, String devise, Double txchange) {
        this.nobill = nobill;
        this.nounite = nounite;
        this.codedeclarant = codedeclarant;
        this.designation = designation;
        this.ice = ice;
        this.mnte = mnte;
        this.datebill = datebill;
        this.delaipay = delaipay;
        this.dateechange = dateechange;
        this.mntm = mntm;
        this.mntmpayd = mntmpayd;
        this.datepay = datepay;
        this.devise = devise;
        this.txchange = txchange;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNobill() {
        return nobill;
    }

    public void setNobill(String nobill) {
        this.nobill = nobill;
    }

    public String getNounite() {
        return nounite;
    }

    public void setNounite(String nounite) {
        this.nounite = nounite;
    }

    public String getCodedeclarant() {
        return codedeclarant;
    }

    public void setCodedeclarant(String codedeclarant) {
        this.codedeclarant = codedeclarant;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public Double getMnte() {
        return mnte;
    }

    public void setMnte(Double mnte) {
        this.mnte = mnte;
    }

    public Timestamp getDatebill() {
        return datebill;
    }

    public void setDatebill(Timestamp datebill) {
        this.datebill = datebill;
    }

    public String getDelaipay() {
        return delaipay;
    }

    public void setDelaipay(String delaipay) {
        this.delaipay = delaipay;
    }

    public Timestamp getDateechange() {
        return dateechange;
    }

    public void setDateechange(Timestamp dateechange) {
        this.dateechange = dateechange;
    }

    public Double getMntm() {
        return mntm;
    }

    public void setMntm(Double mntm) {
        this.mntm = mntm;
    }

    public Double getMntmpayd() {
        return mntmpayd;
    }

    public void setMntmpayd(Double mntmpayd) {
        this.mntmpayd = mntmpayd;
    }

    public Timestamp getDatepay() {
        return datepay;
    }

    public void setDatepay(Timestamp datepay) {
        this.datepay = datepay;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public Double getTxchange() {
        return txchange;
    }

    public void setTxchange(Double txchange) {
        this.txchange = txchange;
    }
}
