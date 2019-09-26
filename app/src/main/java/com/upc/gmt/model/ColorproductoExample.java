package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.List;

public class ColorproductoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColorproductoExample() {
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

        public Criteria andIdColorProductoIsNull() {
            addCriterion("IdColorProducto is null");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoIsNotNull() {
            addCriterion("IdColorProducto is not null");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoEqualTo(Integer value) {
            addCriterion("IdColorProducto =", value, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoNotEqualTo(Integer value) {
            addCriterion("IdColorProducto <>", value, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoGreaterThan(Integer value) {
            addCriterion("IdColorProducto >", value, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdColorProducto >=", value, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoLessThan(Integer value) {
            addCriterion("IdColorProducto <", value, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoLessThanOrEqualTo(Integer value) {
            addCriterion("IdColorProducto <=", value, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoIn(List<Integer> values) {
            addCriterion("IdColorProducto in", values, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoNotIn(List<Integer> values) {
            addCriterion("IdColorProducto not in", values, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoBetween(Integer value1, Integer value2) {
            addCriterion("IdColorProducto between", value1, value2, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andIdColorProductoNotBetween(Integer value1, Integer value2) {
            addCriterion("IdColorProducto not between", value1, value2, "idColorProducto");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andIdEstadoIsNull() {
            addCriterion("IdEstado is null");
            return (Criteria) this;
        }

        public Criteria andIdEstadoIsNotNull() {
            addCriterion("IdEstado is not null");
            return (Criteria) this;
        }

        public Criteria andIdEstadoEqualTo(String value) {
            addCriterion("IdEstado =", value, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoNotEqualTo(String value) {
            addCriterion("IdEstado <>", value, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoGreaterThan(String value) {
            addCriterion("IdEstado >", value, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoGreaterThanOrEqualTo(String value) {
            addCriterion("IdEstado >=", value, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoLessThan(String value) {
            addCriterion("IdEstado <", value, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoLessThanOrEqualTo(String value) {
            addCriterion("IdEstado <=", value, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoLike(String value) {
            addCriterion("IdEstado like", value, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoNotLike(String value) {
            addCriterion("IdEstado not like", value, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoIn(List<String> values) {
            addCriterion("IdEstado in", values, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoNotIn(List<String> values) {
            addCriterion("IdEstado not in", values, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoBetween(String value1, String value2) {
            addCriterion("IdEstado between", value1, value2, "idEstado");
            return (Criteria) this;
        }

        public Criteria andIdEstadoNotBetween(String value1, String value2) {
            addCriterion("IdEstado not between", value1, value2, "idEstado");
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