package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DetalleventaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetalleventaExample() {
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

        public Criteria andCantidadIsNull() {
            addCriterion("Cantidad is null");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNotNull() {
            addCriterion("Cantidad is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadEqualTo(Integer value) {
            addCriterion("Cantidad =", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotEqualTo(Integer value) {
            addCriterion("Cantidad <>", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThan(Integer value) {
            addCriterion("Cantidad >", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("Cantidad >=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThan(Integer value) {
            addCriterion("Cantidad <", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThanOrEqualTo(Integer value) {
            addCriterion("Cantidad <=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadIn(List<Integer> values) {
            addCriterion("Cantidad in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotIn(List<Integer> values) {
            addCriterion("Cantidad not in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadBetween(Integer value1, Integer value2) {
            addCriterion("Cantidad between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotBetween(Integer value1, Integer value2) {
            addCriterion("Cantidad not between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioIsNull() {
            addCriterion("PrecioUnitario is null");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioIsNotNull() {
            addCriterion("PrecioUnitario is not null");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioEqualTo(BigDecimal value) {
            addCriterion("PrecioUnitario =", value, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioNotEqualTo(BigDecimal value) {
            addCriterion("PrecioUnitario <>", value, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioGreaterThan(BigDecimal value) {
            addCriterion("PrecioUnitario >", value, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PrecioUnitario >=", value, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioLessThan(BigDecimal value) {
            addCriterion("PrecioUnitario <", value, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PrecioUnitario <=", value, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioIn(List<BigDecimal> values) {
            addCriterion("PrecioUnitario in", values, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioNotIn(List<BigDecimal> values) {
            addCriterion("PrecioUnitario not in", values, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PrecioUnitario between", value1, value2, "precioUnitario");
            return (Criteria) this;
        }

        public Criteria andPrecioUnitarioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PrecioUnitario not between", value1, value2, "precioUnitario");
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