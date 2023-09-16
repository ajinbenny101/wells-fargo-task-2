package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue()
    private long portfolioSecurityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "securityId")
    private Security security;

    protected PortfolioSecurity() {
    }

    public PortfolioSecurity(Portfolio portfolio, Security security) {
        this.portfolio = portfolio;
        this.security = security;
    }

    /**
     * @return long return the portfolioSecurityId
     */
    public long getPortfolioSecurityId() {
        return portfolioSecurityId;
    }

    /**
     * @param portfolioSecurityId the portfolioSecurityId to set
     */
    public void setPortfolioSecurityId(long portfolioSecurityId) {
        this.portfolioSecurityId = portfolioSecurityId;
    }

    /**
     * @return Portfolio return the portfolio
     */
    public Portfolio getPortfolio() {
        return portfolio;
    }

    /**
     * @param portfolio the portfolio to set
     */
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    /**
     * @return Security return the security
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * @param security the security to set
     */
    public void setSecurity(Security security) {
        this.security = security;
    }

}

