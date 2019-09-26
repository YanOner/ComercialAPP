package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CostoubigeoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostoubigeoExample() {
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

        public Criteria andDescripionIsNull() {
            addCriterion("Descripion is null");
            return (Criteria) this;
        }

        public Criteria andDescripionIsNotNull() {
            addCriterion("Descripion is not null");
            return (Criteria) this;
        }

        public Criteria andDescripionEqualTo(String value) {
            addCriterion("Descripion =", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionNotEqualTo(String value) {
            addCriterion("Descripion <>", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionGreaterThan(String value) {
            addCriterion("Descripion >", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionGreaterThanOrEqualTo(String value) {
            addCriterion("Descripion >=", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionLessThan(String value) {
            addCriterion("Descripion <", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionLessThanOrEqualTo(String value) {
            addCriterion("Descripion <=", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionLike(String value) {
            addCriterion("Descripion like", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionNotLike(String value) {
            addCriterion("Descripion not like", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionIn(List<String> values) {
            addCriterion("Descripion in", values, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionNotIn(List<String> values) {
            addCriterion("Descripion not in", values, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionBetween(String value1, String value2) {
            addCriterion("Descripion between", value1, value2, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionNotBetween(String value1, String value2) {
            addCriterion("Descripion not between", value1, value2, "descripion");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioIsNull() {
            addCriterion("CostoEnvio is null");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioIsNotNull() {
            addCriterion("CostoEnvio is not null");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioEqualTo(BigDecimal value) {
            addCriterion("CostoEnvio =", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioNotEqualTo(BigDecimal value) {
            addCriterion("CostoEnvio <>", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioGreaterThan(BigDecimal value) {
            addCriterion("CostoEnvio >", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CostoEnvio >=", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioLessThan(BigDecimal value) {
            addCriterion("CostoEnvio <", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CostoEnvio <=", value, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioIn(List<BigDecimal> values) {
            addCriterion("CostoEnvio in", values, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioNotIn(List<BigDecimal> values) {
            addCriterion("CostoEnvio not in", values, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostoEnvio between", value1, value2, "costoEnvio");
            return (Criteria) this;
        }

        public Criteria andCostoEnvioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostoEnvio not between", value1, value2, "costoEnvio");
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