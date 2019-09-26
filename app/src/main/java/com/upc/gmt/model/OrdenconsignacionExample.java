package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdenconsignacionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdenconsignacionExample() {
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

        public Criteria andIdOrdenConsignacionIsNull() {
            addCriterion("IdOrdenConsignacion is null");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionIsNotNull() {
            addCriterion("IdOrdenConsignacion is not null");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionEqualTo(Integer value) {
            addCriterion("IdOrdenConsignacion =", value, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionNotEqualTo(Integer value) {
            addCriterion("IdOrdenConsignacion <>", value, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionGreaterThan(Integer value) {
            addCriterion("IdOrdenConsignacion >", value, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdOrdenConsignacion >=", value, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionLessThan(Integer value) {
            addCriterion("IdOrdenConsignacion <", value, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionLessThanOrEqualTo(Integer value) {
            addCriterion("IdOrdenConsignacion <=", value, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionIn(List<Integer> values) {
            addCriterion("IdOrdenConsignacion in", values, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionNotIn(List<Integer> values) {
            addCriterion("IdOrdenConsignacion not in", values, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionBetween(Integer value1, Integer value2) {
            addCriterion("IdOrdenConsignacion between", value1, value2, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andIdOrdenConsignacionNotBetween(Integer value1, Integer value2) {
            addCriterion("IdOrdenConsignacion not between", value1, value2, "idOrdenConsignacion");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaIsNull() {
            addCriterion("FechaProgramada is null");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaIsNotNull() {
            addCriterion("FechaProgramada is not null");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProgramada =", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProgramada <>", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaProgramada >", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProgramada >=", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaLessThan(Date value) {
            addCriterionForJDBCDate("FechaProgramada <", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProgramada <=", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaIn(List<Date> values) {
            addCriterionForJDBCDate("FechaProgramada in", values, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaProgramada not in", values, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaProgramada between", value1, value2, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaProgramada not between", value1, value2, "fechaProgramada");
            return (Criteria) this;
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

        public Criteria andNroCuotaIsNull() {
            addCriterion("NroCuota is null");
            return (Criteria) this;
        }

        public Criteria andNroCuotaIsNotNull() {
            addCriterion("NroCuota is not null");
            return (Criteria) this;
        }

        public Criteria andNroCuotaEqualTo(Integer value) {
            addCriterion("NroCuota =", value, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaNotEqualTo(Integer value) {
            addCriterion("NroCuota <>", value, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaGreaterThan(Integer value) {
            addCriterion("NroCuota >", value, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("NroCuota >=", value, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaLessThan(Integer value) {
            addCriterion("NroCuota <", value, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaLessThanOrEqualTo(Integer value) {
            addCriterion("NroCuota <=", value, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaIn(List<Integer> values) {
            addCriterion("NroCuota in", values, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaNotIn(List<Integer> values) {
            addCriterion("NroCuota not in", values, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaBetween(Integer value1, Integer value2) {
            addCriterion("NroCuota between", value1, value2, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andNroCuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("NroCuota not between", value1, value2, "nroCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaIsNull() {
            addCriterion("MontoCuota is null");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaIsNotNull() {
            addCriterion("MontoCuota is not null");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaEqualTo(BigDecimal value) {
            addCriterion("MontoCuota =", value, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaNotEqualTo(BigDecimal value) {
            addCriterion("MontoCuota <>", value, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaGreaterThan(BigDecimal value) {
            addCriterion("MontoCuota >", value, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoCuota >=", value, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaLessThan(BigDecimal value) {
            addCriterion("MontoCuota <", value, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoCuota <=", value, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaIn(List<BigDecimal> values) {
            addCriterion("MontoCuota in", values, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaNotIn(List<BigDecimal> values) {
            addCriterion("MontoCuota not in", values, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoCuota between", value1, value2, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMontoCuotaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoCuota not between", value1, value2, "montoCuota");
            return (Criteria) this;
        }

        public Criteria andMoraIsNull() {
            addCriterion("Mora is null");
            return (Criteria) this;
        }

        public Criteria andMoraIsNotNull() {
            addCriterion("Mora is not null");
            return (Criteria) this;
        }

        public Criteria andMoraEqualTo(BigDecimal value) {
            addCriterion("Mora =", value, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraNotEqualTo(BigDecimal value) {
            addCriterion("Mora <>", value, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraGreaterThan(BigDecimal value) {
            addCriterion("Mora >", value, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Mora >=", value, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraLessThan(BigDecimal value) {
            addCriterion("Mora <", value, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Mora <=", value, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraIn(List<BigDecimal> values) {
            addCriterion("Mora in", values, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraNotIn(List<BigDecimal> values) {
            addCriterion("Mora not in", values, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Mora between", value1, value2, "mora");
            return (Criteria) this;
        }

        public Criteria andMoraNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Mora not between", value1, value2, "mora");
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