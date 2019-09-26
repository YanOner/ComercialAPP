package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CupondescuentoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CupondescuentoExample() {
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

        public Criteria andCodigoCuponIsNull() {
            addCriterion("CodigoCupon is null");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponIsNotNull() {
            addCriterion("CodigoCupon is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponEqualTo(String value) {
            addCriterion("CodigoCupon =", value, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponNotEqualTo(String value) {
            addCriterion("CodigoCupon <>", value, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponGreaterThan(String value) {
            addCriterion("CodigoCupon >", value, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponGreaterThanOrEqualTo(String value) {
            addCriterion("CodigoCupon >=", value, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponLessThan(String value) {
            addCriterion("CodigoCupon <", value, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponLessThanOrEqualTo(String value) {
            addCriterion("CodigoCupon <=", value, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponLike(String value) {
            addCriterion("CodigoCupon like", value, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponNotLike(String value) {
            addCriterion("CodigoCupon not like", value, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponIn(List<String> values) {
            addCriterion("CodigoCupon in", values, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponNotIn(List<String> values) {
            addCriterion("CodigoCupon not in", values, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponBetween(String value1, String value2) {
            addCriterion("CodigoCupon between", value1, value2, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andCodigoCuponNotBetween(String value1, String value2) {
            addCriterion("CodigoCupon not between", value1, value2, "codigoCupon");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioIsNull() {
            addCriterion("FechaValInicio is null");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioIsNotNull() {
            addCriterion("FechaValInicio is not null");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioEqualTo(Date value) {
            addCriterionForJDBCDate("FechaValInicio =", value, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaValInicio <>", value, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaValInicio >", value, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaValInicio >=", value, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioLessThan(Date value) {
            addCriterionForJDBCDate("FechaValInicio <", value, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaValInicio <=", value, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioIn(List<Date> values) {
            addCriterionForJDBCDate("FechaValInicio in", values, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaValInicio not in", values, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaValInicio between", value1, value2, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValInicioNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaValInicio not between", value1, value2, "fechaValInicio");
            return (Criteria) this;
        }

        public Criteria andFechaValFinIsNull() {
            addCriterion("FechaValFin is null");
            return (Criteria) this;
        }

        public Criteria andFechaValFinIsNotNull() {
            addCriterion("FechaValFin is not null");
            return (Criteria) this;
        }

        public Criteria andFechaValFinEqualTo(Date value) {
            addCriterionForJDBCDate("FechaValFin =", value, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaValFin <>", value, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaValFin >", value, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaValFin >=", value, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinLessThan(Date value) {
            addCriterionForJDBCDate("FechaValFin <", value, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaValFin <=", value, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinIn(List<Date> values) {
            addCriterionForJDBCDate("FechaValFin in", values, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaValFin not in", values, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaValFin between", value1, value2, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andFechaValFinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaValFin not between", value1, value2, "fechaValFin");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoIsNull() {
            addCriterion("PorcDescuento is null");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoIsNotNull() {
            addCriterion("PorcDescuento is not null");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoEqualTo(BigDecimal value) {
            addCriterion("PorcDescuento =", value, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoNotEqualTo(BigDecimal value) {
            addCriterion("PorcDescuento <>", value, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoGreaterThan(BigDecimal value) {
            addCriterion("PorcDescuento >", value, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PorcDescuento >=", value, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoLessThan(BigDecimal value) {
            addCriterion("PorcDescuento <", value, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PorcDescuento <=", value, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoIn(List<BigDecimal> values) {
            addCriterion("PorcDescuento in", values, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoNotIn(List<BigDecimal> values) {
            addCriterion("PorcDescuento not in", values, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PorcDescuento between", value1, value2, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andPorcDescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PorcDescuento not between", value1, value2, "porcDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoIsNull() {
            addCriterion("MontoDescuento is null");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoIsNotNull() {
            addCriterion("MontoDescuento is not null");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoEqualTo(BigDecimal value) {
            addCriterion("MontoDescuento =", value, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoNotEqualTo(BigDecimal value) {
            addCriterion("MontoDescuento <>", value, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoGreaterThan(BigDecimal value) {
            addCriterion("MontoDescuento >", value, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoDescuento >=", value, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoLessThan(BigDecimal value) {
            addCriterion("MontoDescuento <", value, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoDescuento <=", value, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoIn(List<BigDecimal> values) {
            addCriterion("MontoDescuento in", values, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoNotIn(List<BigDecimal> values) {
            addCriterion("MontoDescuento not in", values, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoDescuento between", value1, value2, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andMontoDescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoDescuento not between", value1, value2, "montoDescuento");
            return (Criteria) this;
        }

        public Criteria andObservacionIsNull() {
            addCriterion("Observacion is null");
            return (Criteria) this;
        }

        public Criteria andObservacionIsNotNull() {
            addCriterion("Observacion is not null");
            return (Criteria) this;
        }

        public Criteria andObservacionEqualTo(String value) {
            addCriterion("Observacion =", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotEqualTo(String value) {
            addCriterion("Observacion <>", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionGreaterThan(String value) {
            addCriterion("Observacion >", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionGreaterThanOrEqualTo(String value) {
            addCriterion("Observacion >=", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLessThan(String value) {
            addCriterion("Observacion <", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLessThanOrEqualTo(String value) {
            addCriterion("Observacion <=", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLike(String value) {
            addCriterion("Observacion like", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotLike(String value) {
            addCriterion("Observacion not like", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionIn(List<String> values) {
            addCriterion("Observacion in", values, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotIn(List<String> values) {
            addCriterion("Observacion not in", values, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionBetween(String value1, String value2) {
            addCriterion("Observacion between", value1, value2, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotBetween(String value1, String value2) {
            addCriterion("Observacion not between", value1, value2, "observacion");
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