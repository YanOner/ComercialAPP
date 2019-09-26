package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PagosordenconsignacionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PagosordenconsignacionExample() {
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

        public Criteria andCorrelativoIsNull() {
            addCriterion("Correlativo is null");
            return (Criteria) this;
        }

        public Criteria andCorrelativoIsNotNull() {
            addCriterion("Correlativo is not null");
            return (Criteria) this;
        }

        public Criteria andCorrelativoEqualTo(Integer value) {
            addCriterion("Correlativo =", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoNotEqualTo(Integer value) {
            addCriterion("Correlativo <>", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoGreaterThan(Integer value) {
            addCriterion("Correlativo >", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Correlativo >=", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoLessThan(Integer value) {
            addCriterion("Correlativo <", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoLessThanOrEqualTo(Integer value) {
            addCriterion("Correlativo <=", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoIn(List<Integer> values) {
            addCriterion("Correlativo in", values, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoNotIn(List<Integer> values) {
            addCriterion("Correlativo not in", values, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoBetween(Integer value1, Integer value2) {
            addCriterion("Correlativo between", value1, value2, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoNotBetween(Integer value1, Integer value2) {
            addCriterion("Correlativo not between", value1, value2, "correlativo");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoIsNull() {
            addCriterion("MontoAbonado is null");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoIsNotNull() {
            addCriterion("MontoAbonado is not null");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoEqualTo(BigDecimal value) {
            addCriterion("MontoAbonado =", value, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoNotEqualTo(BigDecimal value) {
            addCriterion("MontoAbonado <>", value, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoGreaterThan(BigDecimal value) {
            addCriterion("MontoAbonado >", value, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoAbonado >=", value, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoLessThan(BigDecimal value) {
            addCriterion("MontoAbonado <", value, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoAbonado <=", value, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoIn(List<BigDecimal> values) {
            addCriterion("MontoAbonado in", values, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoNotIn(List<BigDecimal> values) {
            addCriterion("MontoAbonado not in", values, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoAbonado between", value1, value2, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andMontoAbonadoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoAbonado not between", value1, value2, "montoAbonado");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNull() {
            addCriterion("FechaPago is null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNotNull() {
            addCriterion("FechaPago is not null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoEqualTo(Date value) {
            addCriterionForJDBCDate("FechaPago =", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaPago <>", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaPago >", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaPago >=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThan(Date value) {
            addCriterionForJDBCDate("FechaPago <", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaPago <=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIn(List<Date> values) {
            addCriterionForJDBCDate("FechaPago in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaPago not in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaPago between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaPago not between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoIsNull() {
            addCriterion("NroBoletaPago is null");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoIsNotNull() {
            addCriterion("NroBoletaPago is not null");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoEqualTo(String value) {
            addCriterion("NroBoletaPago =", value, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoNotEqualTo(String value) {
            addCriterion("NroBoletaPago <>", value, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoGreaterThan(String value) {
            addCriterion("NroBoletaPago >", value, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoGreaterThanOrEqualTo(String value) {
            addCriterion("NroBoletaPago >=", value, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoLessThan(String value) {
            addCriterion("NroBoletaPago <", value, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoLessThanOrEqualTo(String value) {
            addCriterion("NroBoletaPago <=", value, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoLike(String value) {
            addCriterion("NroBoletaPago like", value, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoNotLike(String value) {
            addCriterion("NroBoletaPago not like", value, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoIn(List<String> values) {
            addCriterion("NroBoletaPago in", values, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoNotIn(List<String> values) {
            addCriterion("NroBoletaPago not in", values, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoBetween(String value1, String value2) {
            addCriterion("NroBoletaPago between", value1, value2, "nroBoletaPago");
            return (Criteria) this;
        }

        public Criteria andNroBoletaPagoNotBetween(String value1, String value2) {
            addCriterion("NroBoletaPago not between", value1, value2, "nroBoletaPago");
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