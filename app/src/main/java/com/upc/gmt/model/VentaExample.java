package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VentaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VentaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdVentaIsNull() {
            addCriterion("IdVenta is null");
            return (Criteria) this;
        }

        public Criteria andIdVentaIsNotNull() {
            addCriterion("IdVenta is not null");
            return (Criteria) this;
        }

        public Criteria andIdVentaEqualTo(Integer value) {
            addCriterion("IdVenta =", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaNotEqualTo(Integer value) {
            addCriterion("IdVenta <>", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaGreaterThan(Integer value) {
            addCriterion("IdVenta >", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdVenta >=", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaLessThan(Integer value) {
            addCriterion("IdVenta <", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaLessThanOrEqualTo(Integer value) {
            addCriterion("IdVenta <=", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaIn(List<Integer> values) {
            addCriterion("IdVenta in", values, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaNotIn(List<Integer> values) {
            addCriterion("IdVenta not in", values, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaBetween(Integer value1, Integer value2) {
            addCriterion("IdVenta between", value1, value2, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaNotBetween(Integer value1, Integer value2) {
            addCriterion("IdVenta not between", value1, value2, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdClienteIsNull() {
            addCriterion("IdCliente is null");
            return (Criteria) this;
        }

        public Criteria andIdClienteIsNotNull() {
            addCriterion("IdCliente is not null");
            return (Criteria) this;
        }

        public Criteria andIdClienteEqualTo(Integer value) {
            addCriterion("IdCliente =", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotEqualTo(Integer value) {
            addCriterion("IdCliente <>", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThan(Integer value) {
            addCriterion("IdCliente >", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdCliente >=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThan(Integer value) {
            addCriterion("IdCliente <", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThanOrEqualTo(Integer value) {
            addCriterion("IdCliente <=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteIn(List<Integer> values) {
            addCriterion("IdCliente in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotIn(List<Integer> values) {
            addCriterion("IdCliente not in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteBetween(Integer value1, Integer value2) {
            addCriterion("IdCliente between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotBetween(Integer value1, Integer value2) {
            addCriterion("IdCliente not between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andFechaVentaIsNull() {
            addCriterion("FechaVenta is null");
            return (Criteria) this;
        }

        public Criteria andFechaVentaIsNotNull() {
            addCriterion("FechaVenta is not null");
            return (Criteria) this;
        }

        public Criteria andFechaVentaEqualTo(Date value) {
            addCriterionForJDBCDate("FechaVenta =", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaVenta <>", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaVenta >", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaVenta >=", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaLessThan(Date value) {
            addCriterionForJDBCDate("FechaVenta <", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaVenta <=", value, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaIn(List<Date> values) {
            addCriterionForJDBCDate("FechaVenta in", values, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaVenta not in", values, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaVenta between", value1, value2, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andFechaVentaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaVenta not between", value1, value2, "fechaVenta");
            return (Criteria) this;
        }

        public Criteria andSubTotalIsNull() {
            addCriterion("SubTotal is null");
            return (Criteria) this;
        }

        public Criteria andSubTotalIsNotNull() {
            addCriterion("SubTotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubTotalEqualTo(BigDecimal value) {
            addCriterion("SubTotal =", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalNotEqualTo(BigDecimal value) {
            addCriterion("SubTotal <>", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalGreaterThan(BigDecimal value) {
            addCriterion("SubTotal >", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SubTotal >=", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalLessThan(BigDecimal value) {
            addCriterion("SubTotal <", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SubTotal <=", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalIn(List<BigDecimal> values) {
            addCriterion("SubTotal in", values, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalNotIn(List<BigDecimal> values) {
            addCriterion("SubTotal not in", values, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SubTotal between", value1, value2, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SubTotal not between", value1, value2, "subTotal");
            return (Criteria) this;
        }

        public Criteria andIGVIsNull() {
            addCriterion("IGV is null");
            return (Criteria) this;
        }

        public Criteria andIGVIsNotNull() {
            addCriterion("IGV is not null");
            return (Criteria) this;
        }

        public Criteria andIGVEqualTo(BigDecimal value) {
            addCriterion("IGV =", value, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVNotEqualTo(BigDecimal value) {
            addCriterion("IGV <>", value, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVGreaterThan(BigDecimal value) {
            addCriterion("IGV >", value, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IGV >=", value, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVLessThan(BigDecimal value) {
            addCriterion("IGV <", value, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IGV <=", value, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVIn(List<BigDecimal> values) {
            addCriterion("IGV in", values, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVNotIn(List<BigDecimal> values) {
            addCriterion("IGV not in", values, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IGV between", value1, value2, "IGV");
            return (Criteria) this;
        }

        public Criteria andIGVNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IGV not between", value1, value2, "IGV");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNull() {
            addCriterion("Descuento is null");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNotNull() {
            addCriterion("Descuento is not null");
            return (Criteria) this;
        }

        public Criteria andDescuentoEqualTo(BigDecimal value) {
            addCriterion("Descuento =", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotEqualTo(BigDecimal value) {
            addCriterion("Descuento <>", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThan(BigDecimal value) {
            addCriterion("Descuento >", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Descuento >=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThan(BigDecimal value) {
            addCriterion("Descuento <", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Descuento <=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoIn(List<BigDecimal> values) {
            addCriterion("Descuento in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotIn(List<BigDecimal> values) {
            addCriterion("Descuento not in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Descuento between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Descuento not between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("Total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("Total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("Total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("Total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("Total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("Total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("Total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("Total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaIsNull() {
            addCriterion("MontoEntrega is null");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaIsNotNull() {
            addCriterion("MontoEntrega is not null");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaEqualTo(BigDecimal value) {
            addCriterion("MontoEntrega =", value, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaNotEqualTo(BigDecimal value) {
            addCriterion("MontoEntrega <>", value, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaGreaterThan(BigDecimal value) {
            addCriterion("MontoEntrega >", value, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoEntrega >=", value, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaLessThan(BigDecimal value) {
            addCriterion("MontoEntrega <", value, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoEntrega <=", value, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaIn(List<BigDecimal> values) {
            addCriterion("MontoEntrega in", values, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaNotIn(List<BigDecimal> values) {
            addCriterion("MontoEntrega not in", values, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoEntrega between", value1, value2, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andMontoEntregaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoEntrega not between", value1, value2, "montoEntrega");
            return (Criteria) this;
        }

        public Criteria andTotalVentaIsNull() {
            addCriterion("TotalVenta is null");
            return (Criteria) this;
        }

        public Criteria andTotalVentaIsNotNull() {
            addCriterion("TotalVenta is not null");
            return (Criteria) this;
        }

        public Criteria andTotalVentaEqualTo(BigDecimal value) {
            addCriterion("TotalVenta =", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaNotEqualTo(BigDecimal value) {
            addCriterion("TotalVenta <>", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaGreaterThan(BigDecimal value) {
            addCriterion("TotalVenta >", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalVenta >=", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaLessThan(BigDecimal value) {
            addCriterion("TotalVenta <", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalVenta <=", value, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaIn(List<BigDecimal> values) {
            addCriterion("TotalVenta in", values, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaNotIn(List<BigDecimal> values) {
            addCriterion("TotalVenta not in", values, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalVenta between", value1, value2, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andTotalVentaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalVenta not between", value1, value2, "totalVenta");
            return (Criteria) this;
        }

        public Criteria andNroCuotasIsNull() {
            addCriterion("NroCuotas is null");
            return (Criteria) this;
        }

        public Criteria andNroCuotasIsNotNull() {
            addCriterion("NroCuotas is not null");
            return (Criteria) this;
        }

        public Criteria andNroCuotasEqualTo(Integer value) {
            addCriterion("NroCuotas =", value, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasNotEqualTo(Integer value) {
            addCriterion("NroCuotas <>", value, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasGreaterThan(Integer value) {
            addCriterion("NroCuotas >", value, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasGreaterThanOrEqualTo(Integer value) {
            addCriterion("NroCuotas >=", value, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasLessThan(Integer value) {
            addCriterion("NroCuotas <", value, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasLessThanOrEqualTo(Integer value) {
            addCriterion("NroCuotas <=", value, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasIn(List<Integer> values) {
            addCriterion("NroCuotas in", values, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasNotIn(List<Integer> values) {
            addCriterion("NroCuotas not in", values, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasBetween(Integer value1, Integer value2) {
            addCriterion("NroCuotas between", value1, value2, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andNroCuotasNotBetween(Integer value1, Integer value2) {
            addCriterion("NroCuotas not between", value1, value2, "nroCuotas");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoIsNull() {
            addCriterion("TipoRecojo is null");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoIsNotNull() {
            addCriterion("TipoRecojo is not null");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoEqualTo(String value) {
            addCriterion("TipoRecojo =", value, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoNotEqualTo(String value) {
            addCriterion("TipoRecojo <>", value, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoGreaterThan(String value) {
            addCriterion("TipoRecojo >", value, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoGreaterThanOrEqualTo(String value) {
            addCriterion("TipoRecojo >=", value, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoLessThan(String value) {
            addCriterion("TipoRecojo <", value, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoLessThanOrEqualTo(String value) {
            addCriterion("TipoRecojo <=", value, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoLike(String value) {
            addCriterion("TipoRecojo like", value, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoNotLike(String value) {
            addCriterion("TipoRecojo not like", value, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoIn(List<String> values) {
            addCriterion("TipoRecojo in", values, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoNotIn(List<String> values) {
            addCriterion("TipoRecojo not in", values, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoBetween(String value1, String value2) {
            addCriterion("TipoRecojo between", value1, value2, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoRecojoNotBetween(String value1, String value2) {
            addCriterion("TipoRecojo not between", value1, value2, "tipoRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoIsNull() {
            addCriterion("UsuarioModifico is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoIsNotNull() {
            addCriterion("UsuarioModifico is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoEqualTo(String value) {
            addCriterion("UsuarioModifico =", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoNotEqualTo(String value) {
            addCriterion("UsuarioModifico <>", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoGreaterThan(String value) {
            addCriterion("UsuarioModifico >", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoGreaterThanOrEqualTo(String value) {
            addCriterion("UsuarioModifico >=", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoLessThan(String value) {
            addCriterion("UsuarioModifico <", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoLessThanOrEqualTo(String value) {
            addCriterion("UsuarioModifico <=", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoLike(String value) {
            addCriterion("UsuarioModifico like", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoNotLike(String value) {
            addCriterion("UsuarioModifico not like", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoIn(List<String> values) {
            addCriterion("UsuarioModifico in", values, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoNotIn(List<String> values) {
            addCriterion("UsuarioModifico not in", values, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoBetween(String value1, String value2) {
            addCriterion("UsuarioModifico between", value1, value2, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoNotBetween(String value1, String value2) {
            addCriterion("UsuarioModifico not between", value1, value2, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoIsNull() {
            addCriterion("FechaModifico is null");
            return (Criteria) this;
        }

        public Criteria andFechaModificoIsNotNull() {
            addCriterion("FechaModifico is not null");
            return (Criteria) this;
        }

        public Criteria andFechaModificoEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModifico =", value, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModifico <>", value, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaModifico >", value, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModifico >=", value, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoLessThan(Date value) {
            addCriterionForJDBCDate("FechaModifico <", value, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModifico <=", value, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoIn(List<Date> values) {
            addCriterionForJDBCDate("FechaModifico in", values, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaModifico not in", values, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaModifico between", value1, value2, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaModifico not between", value1, value2, "fechaModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloIsNull() {
            addCriterion("UsuarioAnulo is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloIsNotNull() {
            addCriterion("UsuarioAnulo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloEqualTo(String value) {
            addCriterion("UsuarioAnulo =", value, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloNotEqualTo(String value) {
            addCriterion("UsuarioAnulo <>", value, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloGreaterThan(String value) {
            addCriterion("UsuarioAnulo >", value, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloGreaterThanOrEqualTo(String value) {
            addCriterion("UsuarioAnulo >=", value, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloLessThan(String value) {
            addCriterion("UsuarioAnulo <", value, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloLessThanOrEqualTo(String value) {
            addCriterion("UsuarioAnulo <=", value, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloLike(String value) {
            addCriterion("UsuarioAnulo like", value, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloNotLike(String value) {
            addCriterion("UsuarioAnulo not like", value, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloIn(List<String> values) {
            addCriterion("UsuarioAnulo in", values, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloNotIn(List<String> values) {
            addCriterion("UsuarioAnulo not in", values, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloBetween(String value1, String value2) {
            addCriterion("UsuarioAnulo between", value1, value2, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnuloNotBetween(String value1, String value2) {
            addCriterion("UsuarioAnulo not between", value1, value2, "usuarioAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloIsNull() {
            addCriterion("FechaAnulo is null");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloIsNotNull() {
            addCriterion("FechaAnulo is not null");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloEqualTo(Date value) {
            addCriterionForJDBCDate("FechaAnulo =", value, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaAnulo <>", value, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaAnulo >", value, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaAnulo >=", value, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloLessThan(Date value) {
            addCriterionForJDBCDate("FechaAnulo <", value, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaAnulo <=", value, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloIn(List<Date> values) {
            addCriterionForJDBCDate("FechaAnulo in", values, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaAnulo not in", values, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaAnulo between", value1, value2, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andFechaAnuloNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaAnulo not between", value1, value2, "fechaAnulo");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaIsNull() {
            addCriterion("NumOperaBancaria is null");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaIsNotNull() {
            addCriterion("NumOperaBancaria is not null");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaEqualTo(String value) {
            addCriterion("NumOperaBancaria =", value, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaNotEqualTo(String value) {
            addCriterion("NumOperaBancaria <>", value, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaGreaterThan(String value) {
            addCriterion("NumOperaBancaria >", value, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaGreaterThanOrEqualTo(String value) {
            addCriterion("NumOperaBancaria >=", value, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaLessThan(String value) {
            addCriterion("NumOperaBancaria <", value, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaLessThanOrEqualTo(String value) {
            addCriterion("NumOperaBancaria <=", value, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaLike(String value) {
            addCriterion("NumOperaBancaria like", value, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaNotLike(String value) {
            addCriterion("NumOperaBancaria not like", value, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaIn(List<String> values) {
            addCriterion("NumOperaBancaria in", values, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaNotIn(List<String> values) {
            addCriterion("NumOperaBancaria not in", values, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaBetween(String value1, String value2) {
            addCriterion("NumOperaBancaria between", value1, value2, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andNumOperaBancariaNotBetween(String value1, String value2) {
            addCriterion("NumOperaBancaria not between", value1, value2, "numOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaIsNull() {
            addCriterion("FechaOperaBancaria is null");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaIsNotNull() {
            addCriterion("FechaOperaBancaria is not null");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaEqualTo(Date value) {
            addCriterionForJDBCDate("FechaOperaBancaria =", value, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaOperaBancaria <>", value, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaOperaBancaria >", value, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaOperaBancaria >=", value, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaLessThan(Date value) {
            addCriterionForJDBCDate("FechaOperaBancaria <", value, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaOperaBancaria <=", value, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaIn(List<Date> values) {
            addCriterionForJDBCDate("FechaOperaBancaria in", values, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaOperaBancaria not in", values, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaOperaBancaria between", value1, value2, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andFechaOperaBancariaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaOperaBancaria not between", value1, value2, "fechaOperaBancaria");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaIsNull() {
            addCriterion("CodTrxTarjeta is null");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaIsNotNull() {
            addCriterion("CodTrxTarjeta is not null");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaEqualTo(String value) {
            addCriterion("CodTrxTarjeta =", value, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaNotEqualTo(String value) {
            addCriterion("CodTrxTarjeta <>", value, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaGreaterThan(String value) {
            addCriterion("CodTrxTarjeta >", value, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaGreaterThanOrEqualTo(String value) {
            addCriterion("CodTrxTarjeta >=", value, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaLessThan(String value) {
            addCriterion("CodTrxTarjeta <", value, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaLessThanOrEqualTo(String value) {
            addCriterion("CodTrxTarjeta <=", value, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaLike(String value) {
            addCriterion("CodTrxTarjeta like", value, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaNotLike(String value) {
            addCriterion("CodTrxTarjeta not like", value, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaIn(List<String> values) {
            addCriterion("CodTrxTarjeta in", values, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaNotIn(List<String> values) {
            addCriterion("CodTrxTarjeta not in", values, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaBetween(String value1, String value2) {
            addCriterion("CodTrxTarjeta between", value1, value2, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andCodTrxTarjetaNotBetween(String value1, String value2) {
            addCriterion("CodTrxTarjeta not between", value1, value2, "codTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaIsNull() {
            addCriterion("FechTrxTarjeta is null");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaIsNotNull() {
            addCriterion("FechTrxTarjeta is not null");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaEqualTo(Date value) {
            addCriterionForJDBCDate("FechTrxTarjeta =", value, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechTrxTarjeta <>", value, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechTrxTarjeta >", value, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechTrxTarjeta >=", value, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaLessThan(Date value) {
            addCriterionForJDBCDate("FechTrxTarjeta <", value, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechTrxTarjeta <=", value, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaIn(List<Date> values) {
            addCriterionForJDBCDate("FechTrxTarjeta in", values, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechTrxTarjeta not in", values, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechTrxTarjeta between", value1, value2, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andFechTrxTarjetaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechTrxTarjeta not between", value1, value2, "fechTrxTarjeta");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNull() {
            addCriterion("Estado is null");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNotNull() {
            addCriterion("Estado is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoEqualTo(String value) {
            addCriterion("Estado =", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotEqualTo(String value) {
            addCriterion("Estado <>", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThan(String value) {
            addCriterion("Estado >", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThanOrEqualTo(String value) {
            addCriterion("Estado >=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThan(String value) {
            addCriterion("Estado <", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThanOrEqualTo(String value) {
            addCriterion("Estado <=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLike(String value) {
            addCriterion("Estado like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotLike(String value) {
            addCriterion("Estado not like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoIn(List<String> values) {
            addCriterion("Estado in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotIn(List<String> values) {
            addCriterion("Estado not in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoBetween(String value1, String value2) {
            addCriterion("Estado between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotBetween(String value1, String value2) {
            addCriterion("Estado not between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoIsNull() {
            addCriterion("CodUbigeoCosto is null");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoIsNotNull() {
            addCriterion("CodUbigeoCosto is not null");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoEqualTo(String value) {
            addCriterion("CodUbigeoCosto =", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoNotEqualTo(String value) {
            addCriterion("CodUbigeoCosto <>", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoGreaterThan(String value) {
            addCriterion("CodUbigeoCosto >", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoGreaterThanOrEqualTo(String value) {
            addCriterion("CodUbigeoCosto >=", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoLessThan(String value) {
            addCriterion("CodUbigeoCosto <", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoLessThanOrEqualTo(String value) {
            addCriterion("CodUbigeoCosto <=", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoLike(String value) {
            addCriterion("CodUbigeoCosto like", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoNotLike(String value) {
            addCriterion("CodUbigeoCosto not like", value, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoIn(List<String> values) {
            addCriterion("CodUbigeoCosto in", values, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoNotIn(List<String> values) {
            addCriterion("CodUbigeoCosto not in", values, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoBetween(String value1, String value2) {
            addCriterion("CodUbigeoCosto between", value1, value2, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andCodUbigeoCostoNotBetween(String value1, String value2) {
            addCriterion("CodUbigeoCosto not between", value1, value2, "codUbigeoCosto");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoIsNull() {
            addCriterion("IdFomaPago is null");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoIsNotNull() {
            addCriterion("IdFomaPago is not null");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoEqualTo(Integer value) {
            addCriterion("IdFomaPago =", value, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoNotEqualTo(Integer value) {
            addCriterion("IdFomaPago <>", value, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoGreaterThan(Integer value) {
            addCriterion("IdFomaPago >", value, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdFomaPago >=", value, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoLessThan(Integer value) {
            addCriterion("IdFomaPago <", value, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoLessThanOrEqualTo(Integer value) {
            addCriterion("IdFomaPago <=", value, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoIn(List<Integer> values) {
            addCriterion("IdFomaPago in", values, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoNotIn(List<Integer> values) {
            addCriterion("IdFomaPago not in", values, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoBetween(Integer value1, Integer value2) {
            addCriterion("IdFomaPago between", value1, value2, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdFomaPagoNotBetween(Integer value1, Integer value2) {
            addCriterion("IdFomaPago not between", value1, value2, "idFomaPago");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoIsNull() {
            addCriterion("IdCuponDescuento is null");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoIsNotNull() {
            addCriterion("IdCuponDescuento is not null");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoEqualTo(Integer value) {
            addCriterion("IdCuponDescuento =", value, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoNotEqualTo(Integer value) {
            addCriterion("IdCuponDescuento <>", value, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoGreaterThan(Integer value) {
            addCriterion("IdCuponDescuento >", value, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdCuponDescuento >=", value, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoLessThan(Integer value) {
            addCriterion("IdCuponDescuento <", value, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoLessThanOrEqualTo(Integer value) {
            addCriterion("IdCuponDescuento <=", value, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoIn(List<Integer> values) {
            addCriterion("IdCuponDescuento in", values, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoNotIn(List<Integer> values) {
            addCriterion("IdCuponDescuento not in", values, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoBetween(Integer value1, Integer value2) {
            addCriterion("IdCuponDescuento between", value1, value2, "idCuponDescuento");
            return (Criteria) this;
        }

        public Criteria andIdCuponDescuentoNotBetween(Integer value1, Integer value2) {
            addCriterion("IdCuponDescuento not between", value1, value2, "idCuponDescuento");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}