package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    @Column(nullable = false)
    private Date lastUpdatedDate;

    protected Portfolio() {
    }

    public Portfolio(Date creationDate, Date lastUpdatedDate) {
        this.creationDate = creationDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }


    /**
     * @return long return the portfolioId
     */
    public long getPortfolioId() {
        return portfolioId;
    }

    /**
     * @param portfolioId the portfolioId to set
     */
    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * @return Client return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return Date return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return Date return the lastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * @param lastUpdatedDate the lastUpdatedDate to set
     */
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

}