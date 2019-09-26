package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DisponibilidadmovilidadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisponibilidadmovilidadExample() {
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

        public Criteria andIdMovilidadIsNull() {
            addCriterion("IdMovilidad is null");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadIsNotNull() {
            addCriterion("IdMovilidad is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadEqualTo(Integer value) {
            addCriterion("IdMovilidad =", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadNotEqualTo(Integer value) {
            addCriterion("IdMovilidad <>", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadGreaterThan(Integer value) {
            addCriterion("IdMovilidad >", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdMovilidad >=", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadLessThan(Integer value) {
            addCriterion("IdMovilidad <", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadLessThanOrEqualTo(Integer value) {
            addCriterion("IdMovilidad <=", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadIn(List<Integer> values) {
            addCriterion("IdMovilidad in", values, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadNotIn(List<Integer> values) {
            addCriterion("IdMovilidad not in", values, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadBetween(Integer value1, Integer value2) {
            addCriterion("IdMovilidad between", value1, value2, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadNotBetween(Integer value1, Integer value2) {
            addCriterion("IdMovilidad not between", value1, value2, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoIsNull() {
            addCriterion("IdOrdenDespacho is null");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoIsNotNull() {
            addCriterion("IdOrdenDespacho is not null");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoEqualTo(Integer value) {
            addCriterion("IdOrdenDespacho =", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoNotEqualTo(Integer value) {
            addCriterion("IdOrdenDespacho <>", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoGreaterThan(Integer value) {
            addCriterion("IdOrdenDespacho >", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdOrdenDespacho >=", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoLessThan(Integer value) {
            addCriterion("IdOrdenDespacho <", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoLessThanOrEqualTo(Integer value) {
            addCriterion("IdOrdenDespacho <=", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoIn(List<Integer> values) {
            addCriterion("IdOrdenDespacho in", values, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoNotIn(List<Integer> values) {
            addCriterion("IdOrdenDespacho not in", values, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoBetween(Integer value1, Integer value2) {
            addCriterion("IdOrdenDespacho between", value1, value2, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoNotBetween(Integer value1, Integer value2) {
            addCriterion("IdOrdenDespacho not between", value1, value2, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadIsNull() {
            addCriterion("FechaMovilidad is null");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadIsNotNull() {
            addCriterion("FechaMovilidad is not null");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadEqualTo(Date value) {
            addCriterionForJDBCDate("FechaMovilidad =", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaMovilidad <>", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaMovilidad >", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaMovilidad >=", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadLessThan(Date value) {
            addCriterionForJDBCDate("FechaMovilidad <", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaMovilidad <=", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadIn(List<Date> values) {
            addCriterionForJDBCDate("FechaMovilidad in", values, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaMovilidad not in", values, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaMovilidad between", value1, value2, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaMovilidad not between", value1, value2, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleIsNull() {
            addCriterion("AltoDisponible is null");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleIsNotNull() {
            addCriterion("AltoDisponible is not null");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleEqualTo(BigDecimal value) {
            addCriterion("AltoDisponible =", value, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleNotEqualTo(BigDecimal value) {
            addCriterion("AltoDisponible <>", value, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleGreaterThan(BigDecimal value) {
            addCriterion("AltoDisponible >", value, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AltoDisponible >=", value, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleLessThan(BigDecimal value) {
            addCriterion("AltoDisponible <", value, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AltoDisponible <=", value, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleIn(List<BigDecimal> values) {
            addCriterion("AltoDisponible in", values, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleNotIn(List<BigDecimal> values) {
            addCriterion("AltoDisponible not in", values, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AltoDisponible between", value1, value2, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAltoDisponibleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AltoDisponible not between", value1, value2, "altoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleIsNull() {
            addCriterion("AnchoDisponible is null");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleIsNotNull() {
            addCriterion("AnchoDisponible is not null");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleEqualTo(BigDecimal value) {
            addCriterion("AnchoDisponible =", value, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleNotEqualTo(BigDecimal value) {
            addCriterion("AnchoDisponible <>", value, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleGreaterThan(BigDecimal value) {
            addCriterion("AnchoDisponible >", value, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AnchoDisponible >=", value, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleLessThan(BigDecimal value) {
            addCriterion("AnchoDisponible <", value, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AnchoDisponible <=", value, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleIn(List<BigDecimal> values) {
            addCriterion("AnchoDisponible in", values, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleNotIn(List<BigDecimal> values) {
            addCriterion("AnchoDisponible not in", values, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AnchoDisponible between", value1, value2, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andAnchoDisponibleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AnchoDisponible not between", value1, value2, "anchoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleIsNull() {
            addCriterion("LargoDisponible is null");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleIsNotNull() {
            addCriterion("LargoDisponible is not null");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleEqualTo(BigDecimal value) {
            addCriterion("LargoDisponible =", value, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleNotEqualTo(BigDecimal value) {
            addCriterion("LargoDisponible <>", value, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleGreaterThan(BigDecimal value) {
            addCriterion("LargoDisponible >", value, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LargoDisponible >=", value, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleLessThan(BigDecimal value) {
            addCriterion("LargoDisponible <", value, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LargoDisponible <=", value, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleIn(List<BigDecimal> values) {
            addCriterion("LargoDisponible in", values, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleNotIn(List<BigDecimal> values) {
            addCriterion("LargoDisponible not in", values, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LargoDisponible between", value1, value2, "largoDisponible");
            return (Criteria) this;
        }

        public Criteria andLargoDisponibleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LargoDisponible not between", value1, value2, "largoDisponible");
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