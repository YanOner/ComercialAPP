package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.List;

public class ProductotallacolorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductotallacolorExample() {
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

        public Criteria andIdProductoIsNull() {
            addCriterion("IdProducto is null");
            return (Criteria) this;
        }

        public Criteria andIdProductoIsNotNull() {
            addCriterion("IdProducto is not null");
            return (Criteria) this;
        }

        public Criteria andIdProductoEqualTo(Integer value) {
            addCriterion("IdProducto =", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoNotEqualTo(Integer value) {
            addCriterion("IdProducto <>", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoGreaterThan(Integer value) {
            addCriterion("IdProducto >", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdProducto >=", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoLessThan(Integer value) {
            addCriterion("IdProducto <", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoLessThanOrEqualTo(Integer value) {
            addCriterion("IdProducto <=", value, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoIn(List<Integer> values) {
            addCriterion("IdProducto in", values, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoNotIn(List<Integer> values) {
            addCriterion("IdProducto not in", values, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoBetween(Integer value1, Integer value2) {
            addCriterion("IdProducto between", value1, value2, "idProducto");
            return (Criteria) this;
        }

        public Criteria andIdProductoNotBetween(Integer value1, Integer value2) {
            addCriterion("IdProducto not between", value1, value2, "idProducto");
            return (Criteria) this;
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

        public Criteria andNroTallaIsNull() {
            addCriterion("NroTalla is null");
            return (Criteria) this;
        }

        public Criteria andNroTallaIsNotNull() {
            addCriterion("NroTalla is not null");
            return (Criteria) this;
        }

        public Criteria andNroTallaEqualTo(Integer value) {
            addCriterion("NroTalla =", value, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaNotEqualTo(Integer value) {
            addCriterion("NroTalla <>", value, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaGreaterThan(Integer value) {
            addCriterion("NroTalla >", value, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaGreaterThanOrEqualTo(Integer value) {
            addCriterion("NroTalla >=", value, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaLessThan(Integer value) {
            addCriterion("NroTalla <", value, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaLessThanOrEqualTo(Integer value) {
            addCriterion("NroTalla <=", value, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaIn(List<Integer> values) {
            addCriterion("NroTalla in", values, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaNotIn(List<Integer> values) {
            addCriterion("NroTalla not in", values, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaBetween(Integer value1, Integer value2) {
            addCriterion("NroTalla between", value1, value2, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andNroTallaNotBetween(Integer value1, Integer value2) {
            addCriterion("NroTalla not between", value1, value2, "nroTalla");
            return (Criteria) this;
        }

        public Criteria andStockVentaIsNull() {
            addCriterion("StockVenta is null");
            return (Criteria) this;
        }

        public Criteria andStockVentaIsNotNull() {
            addCriterion("StockVenta is not null");
            return (Criteria) this;
        }

        public Criteria andStockVentaEqualTo(Integer value) {
            addCriterion("StockVenta =", value, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaNotEqualTo(Integer value) {
            addCriterion("StockVenta <>", value, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaGreaterThan(Integer value) {
            addCriterion("StockVenta >", value, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockVenta >=", value, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaLessThan(Integer value) {
            addCriterion("StockVenta <", value, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaLessThanOrEqualTo(Integer value) {
            addCriterion("StockVenta <=", value, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaIn(List<Integer> values) {
            addCriterion("StockVenta in", values, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaNotIn(List<Integer> values) {
            addCriterion("StockVenta not in", values, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaBetween(Integer value1, Integer value2) {
            addCriterion("StockVenta between", value1, value2, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockVentaNotBetween(Integer value1, Integer value2) {
            addCriterion("StockVenta not between", value1, value2, "stockVenta");
            return (Criteria) this;
        }

        public Criteria andStockCriticoIsNull() {
            addCriterion("StockCritico is null");
            return (Criteria) this;
        }

        public Criteria andStockCriticoIsNotNull() {
            addCriterion("StockCritico is not null");
            return (Criteria) this;
        }

        public Criteria andStockCriticoEqualTo(Integer value) {
            addCriterion("StockCritico =", value, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoNotEqualTo(Integer value) {
            addCriterion("StockCritico <>", value, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoGreaterThan(Integer value) {
            addCriterion("StockCritico >", value, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockCritico >=", value, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoLessThan(Integer value) {
            addCriterion("StockCritico <", value, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoLessThanOrEqualTo(Integer value) {
            addCriterion("StockCritico <=", value, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoIn(List<Integer> values) {
            addCriterion("StockCritico in", values, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoNotIn(List<Integer> values) {
            addCriterion("StockCritico not in", values, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoBetween(Integer value1, Integer value2) {
            addCriterion("StockCritico between", value1, value2, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockCriticoNotBetween(Integer value1, Integer value2) {
            addCriterion("StockCritico not between", value1, value2, "stockCritico");
            return (Criteria) this;
        }

        public Criteria andStockObservadoIsNull() {
            addCriterion("StockObservado is null");
            return (Criteria) this;
        }

        public Criteria andStockObservadoIsNotNull() {
            addCriterion("StockObservado is not null");
            return (Criteria) this;
        }

        public Criteria andStockObservadoEqualTo(Integer value) {
            addCriterion("StockObservado =", value, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoNotEqualTo(Integer value) {
            addCriterion("StockObservado <>", value, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoGreaterThan(Integer value) {
            addCriterion("StockObservado >", value, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockObservado >=", value, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoLessThan(Integer value) {
            addCriterion("StockObservado <", value, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoLessThanOrEqualTo(Integer value) {
            addCriterion("StockObservado <=", value, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoIn(List<Integer> values) {
            addCriterion("StockObservado in", values, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoNotIn(List<Integer> values) {
            addCriterion("StockObservado not in", values, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoBetween(Integer value1, Integer value2) {
            addCriterion("StockObservado between", value1, value2, "stockObservado");
            return (Criteria) this;
        }

        public Criteria andStockObservadoNotBetween(Integer value1, Integer value2) {
            addCriterion("StockObservado not between", value1, value2, "stockObservado");
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