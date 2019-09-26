package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductoExample() {
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

        public Criteria andSKUIsNull() {
            addCriterion("SKU is null");
            return (Criteria) this;
        }

        public Criteria andSKUIsNotNull() {
            addCriterion("SKU is not null");
            return (Criteria) this;
        }

        public Criteria andSKUEqualTo(String value) {
            addCriterion("SKU =", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUNotEqualTo(String value) {
            addCriterion("SKU <>", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUGreaterThan(String value) {
            addCriterion("SKU >", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUGreaterThanOrEqualTo(String value) {
            addCriterion("SKU >=", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKULessThan(String value) {
            addCriterion("SKU <", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKULessThanOrEqualTo(String value) {
            addCriterion("SKU <=", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKULike(String value) {
            addCriterion("SKU like", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUNotLike(String value) {
            addCriterion("SKU not like", value, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUIn(List<String> values) {
            addCriterion("SKU in", values, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUNotIn(List<String> values) {
            addCriterion("SKU not in", values, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUBetween(String value1, String value2) {
            addCriterion("SKU between", value1, value2, "SKU");
            return (Criteria) this;
        }

        public Criteria andSKUNotBetween(String value1, String value2) {
            addCriterion("SKU not between", value1, value2, "SKU");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("Descripcion is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("Descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("Descripcion =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("Descripcion <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("Descripcion >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("Descripcion >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("Descripcion <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("Descripcion <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("Descripcion like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("Descripcion not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("Descripcion in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("Descripcion not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("Descripcion between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("Descripcion not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoIsNull() {
            addCriterion("IdTipoProducto is null");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoIsNotNull() {
            addCriterion("IdTipoProducto is not null");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoEqualTo(Integer value) {
            addCriterion("IdTipoProducto =", value, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoNotEqualTo(Integer value) {
            addCriterion("IdTipoProducto <>", value, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoGreaterThan(Integer value) {
            addCriterion("IdTipoProducto >", value, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdTipoProducto >=", value, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoLessThan(Integer value) {
            addCriterion("IdTipoProducto <", value, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoLessThanOrEqualTo(Integer value) {
            addCriterion("IdTipoProducto <=", value, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoIn(List<Integer> values) {
            addCriterion("IdTipoProducto in", values, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoNotIn(List<Integer> values) {
            addCriterion("IdTipoProducto not in", values, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoBetween(Integer value1, Integer value2) {
            addCriterion("IdTipoProducto between", value1, value2, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andIdTipoProductoNotBetween(Integer value1, Integer value2) {
            addCriterion("IdTipoProducto not between", value1, value2, "idTipoProducto");
            return (Criteria) this;
        }

        public Criteria andGeneroIsNull() {
            addCriterion("Genero is null");
            return (Criteria) this;
        }

        public Criteria andGeneroIsNotNull() {
            addCriterion("Genero is not null");
            return (Criteria) this;
        }

        public Criteria andGeneroEqualTo(String value) {
            addCriterion("Genero =", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroNotEqualTo(String value) {
            addCriterion("Genero <>", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroGreaterThan(String value) {
            addCriterion("Genero >", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroGreaterThanOrEqualTo(String value) {
            addCriterion("Genero >=", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroLessThan(String value) {
            addCriterion("Genero <", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroLessThanOrEqualTo(String value) {
            addCriterion("Genero <=", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroLike(String value) {
            addCriterion("Genero like", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroNotLike(String value) {
            addCriterion("Genero not like", value, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroIn(List<String> values) {
            addCriterion("Genero in", values, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroNotIn(List<String> values) {
            addCriterion("Genero not in", values, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroBetween(String value1, String value2) {
            addCriterion("Genero between", value1, value2, "genero");
            return (Criteria) this;
        }

        public Criteria andGeneroNotBetween(String value1, String value2) {
            addCriterion("Genero not between", value1, value2, "genero");
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

        public Criteria andPrecioVendedorIsNull() {
            addCriterion("PrecioVendedor is null");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorIsNotNull() {
            addCriterion("PrecioVendedor is not null");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorEqualTo(BigDecimal value) {
            addCriterion("PrecioVendedor =", value, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorNotEqualTo(BigDecimal value) {
            addCriterion("PrecioVendedor <>", value, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorGreaterThan(BigDecimal value) {
            addCriterion("PrecioVendedor >", value, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PrecioVendedor >=", value, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorLessThan(BigDecimal value) {
            addCriterion("PrecioVendedor <", value, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PrecioVendedor <=", value, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorIn(List<BigDecimal> values) {
            addCriterion("PrecioVendedor in", values, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorNotIn(List<BigDecimal> values) {
            addCriterion("PrecioVendedor not in", values, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PrecioVendedor between", value1, value2, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andPrecioVendedorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PrecioVendedor not between", value1, value2, "precioVendedor");
            return (Criteria) this;
        }

        public Criteria andEstiloIsNull() {
            addCriterion("Estilo is null");
            return (Criteria) this;
        }

        public Criteria andEstiloIsNotNull() {
            addCriterion("Estilo is not null");
            return (Criteria) this;
        }

        public Criteria andEstiloEqualTo(String value) {
            addCriterion("Estilo =", value, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloNotEqualTo(String value) {
            addCriterion("Estilo <>", value, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloGreaterThan(String value) {
            addCriterion("Estilo >", value, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloGreaterThanOrEqualTo(String value) {
            addCriterion("Estilo >=", value, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloLessThan(String value) {
            addCriterion("Estilo <", value, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloLessThanOrEqualTo(String value) {
            addCriterion("Estilo <=", value, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloLike(String value) {
            addCriterion("Estilo like", value, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloNotLike(String value) {
            addCriterion("Estilo not like", value, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloIn(List<String> values) {
            addCriterion("Estilo in", values, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloNotIn(List<String> values) {
            addCriterion("Estilo not in", values, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloBetween(String value1, String value2) {
            addCriterion("Estilo between", value1, value2, "estilo");
            return (Criteria) this;
        }

        public Criteria andEstiloNotBetween(String value1, String value2) {
            addCriterion("Estilo not between", value1, value2, "estilo");
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

        public Criteria andFechaUltimaCargaIsNull() {
            addCriterion("FechaUltimaCarga is null");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaIsNotNull() {
            addCriterion("FechaUltimaCarga is not null");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaEqualTo(Date value) {
            addCriterionForJDBCDate("FechaUltimaCarga =", value, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaUltimaCarga <>", value, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaUltimaCarga >", value, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaUltimaCarga >=", value, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaLessThan(Date value) {
            addCriterionForJDBCDate("FechaUltimaCarga <", value, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaUltimaCarga <=", value, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaIn(List<Date> values) {
            addCriterionForJDBCDate("FechaUltimaCarga in", values, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaUltimaCarga not in", values, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaUltimaCarga between", value1, value2, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaUltimaCargaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaUltimaCarga not between", value1, value2, "fechaUltimaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaIsNull() {
            addCriterion("FechaProximaCarga is null");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaIsNotNull() {
            addCriterion("FechaProximaCarga is not null");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProximaCarga =", value, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProximaCarga <>", value, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaProximaCarga >", value, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProximaCarga >=", value, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaLessThan(Date value) {
            addCriterionForJDBCDate("FechaProximaCarga <", value, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProximaCarga <=", value, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaIn(List<Date> values) {
            addCriterionForJDBCDate("FechaProximaCarga in", values, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaProximaCarga not in", values, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaProximaCarga between", value1, value2, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andFechaProximaCargaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaProximaCarga not between", value1, value2, "fechaProximaCarga");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroIsNull() {
            addCriterion("UsuarioGenero is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroIsNotNull() {
            addCriterion("UsuarioGenero is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroEqualTo(String value) {
            addCriterion("UsuarioGenero =", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroNotEqualTo(String value) {
            addCriterion("UsuarioGenero <>", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroGreaterThan(String value) {
            addCriterion("UsuarioGenero >", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroGreaterThanOrEqualTo(String value) {
            addCriterion("UsuarioGenero >=", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroLessThan(String value) {
            addCriterion("UsuarioGenero <", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroLessThanOrEqualTo(String value) {
            addCriterion("UsuarioGenero <=", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroLike(String value) {
            addCriterion("UsuarioGenero like", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroNotLike(String value) {
            addCriterion("UsuarioGenero not like", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroIn(List<String> values) {
            addCriterion("UsuarioGenero in", values, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroNotIn(List<String> values) {
            addCriterion("UsuarioGenero not in", values, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroBetween(String value1, String value2) {
            addCriterion("UsuarioGenero between", value1, value2, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroNotBetween(String value1, String value2) {
            addCriterion("UsuarioGenero not between", value1, value2, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionIsNull() {
            addCriterion("FechaGeneracion is null");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionIsNotNull() {
            addCriterion("FechaGeneracion is not null");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionEqualTo(Date value) {
            addCriterionForJDBCDate("FechaGeneracion =", value, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaGeneracion <>", value, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaGeneracion >", value, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaGeneracion >=", value, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionLessThan(Date value) {
            addCriterionForJDBCDate("FechaGeneracion <", value, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaGeneracion <=", value, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionIn(List<Date> values) {
            addCriterionForJDBCDate("FechaGeneracion in", values, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaGeneracion not in", values, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaGeneracion between", value1, value2, "fechaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFechaGeneracionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaGeneracion not between", value1, value2, "fechaGeneracion");
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

        public Criteria andFechaModificacionIsNull() {
            addCriterion("FechaModificacion is null");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionIsNotNull() {
            addCriterion("FechaModificacion is not null");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModificacion =", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModificacion <>", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaModificacion >", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModificacion >=", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionLessThan(Date value) {
            addCriterionForJDBCDate("FechaModificacion <", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModificacion <=", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("FechaModificacion in", values, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaModificacion not in", values, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaModificacion between", value1, value2, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaModificacion not between", value1, value2, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteIsNull() {
            addCriterion("AltoPaquete is null");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteIsNotNull() {
            addCriterion("AltoPaquete is not null");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteEqualTo(BigDecimal value) {
            addCriterion("AltoPaquete =", value, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteNotEqualTo(BigDecimal value) {
            addCriterion("AltoPaquete <>", value, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteGreaterThan(BigDecimal value) {
            addCriterion("AltoPaquete >", value, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AltoPaquete >=", value, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteLessThan(BigDecimal value) {
            addCriterion("AltoPaquete <", value, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AltoPaquete <=", value, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteIn(List<BigDecimal> values) {
            addCriterion("AltoPaquete in", values, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteNotIn(List<BigDecimal> values) {
            addCriterion("AltoPaquete not in", values, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AltoPaquete between", value1, value2, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAltoPaqueteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AltoPaquete not between", value1, value2, "altoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteIsNull() {
            addCriterion("AnchoPaquete is null");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteIsNotNull() {
            addCriterion("AnchoPaquete is not null");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteEqualTo(BigDecimal value) {
            addCriterion("AnchoPaquete =", value, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteNotEqualTo(BigDecimal value) {
            addCriterion("AnchoPaquete <>", value, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteGreaterThan(BigDecimal value) {
            addCriterion("AnchoPaquete >", value, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AnchoPaquete >=", value, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteLessThan(BigDecimal value) {
            addCriterion("AnchoPaquete <", value, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AnchoPaquete <=", value, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteIn(List<BigDecimal> values) {
            addCriterion("AnchoPaquete in", values, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteNotIn(List<BigDecimal> values) {
            addCriterion("AnchoPaquete not in", values, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AnchoPaquete between", value1, value2, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andAnchoPaqueteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AnchoPaquete not between", value1, value2, "anchoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteIsNull() {
            addCriterion("LargoPaquete is null");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteIsNotNull() {
            addCriterion("LargoPaquete is not null");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteEqualTo(BigDecimal value) {
            addCriterion("LargoPaquete =", value, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteNotEqualTo(BigDecimal value) {
            addCriterion("LargoPaquete <>", value, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteGreaterThan(BigDecimal value) {
            addCriterion("LargoPaquete >", value, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LargoPaquete >=", value, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteLessThan(BigDecimal value) {
            addCriterion("LargoPaquete <", value, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LargoPaquete <=", value, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteIn(List<BigDecimal> values) {
            addCriterion("LargoPaquete in", values, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteNotIn(List<BigDecimal> values) {
            addCriterion("LargoPaquete not in", values, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LargoPaquete between", value1, value2, "largoPaquete");
            return (Criteria) this;
        }

        public Criteria andLargoPaqueteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LargoPaquete not between", value1, value2, "largoPaquete");
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

        public Criteria andIdTemporadaIsNull() {
            addCriterion("IdTemporada is null");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaIsNotNull() {
            addCriterion("IdTemporada is not null");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaEqualTo(Integer value) {
            addCriterion("IdTemporada =", value, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaNotEqualTo(Integer value) {
            addCriterion("IdTemporada <>", value, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaGreaterThan(Integer value) {
            addCriterion("IdTemporada >", value, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdTemporada >=", value, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaLessThan(Integer value) {
            addCriterion("IdTemporada <", value, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaLessThanOrEqualTo(Integer value) {
            addCriterion("IdTemporada <=", value, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaIn(List<Integer> values) {
            addCriterion("IdTemporada in", values, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaNotIn(List<Integer> values) {
            addCriterion("IdTemporada not in", values, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaBetween(Integer value1, Integer value2) {
            addCriterion("IdTemporada between", value1, value2, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdTemporadaNotBetween(Integer value1, Integer value2) {
            addCriterion("IdTemporada not between", value1, value2, "idTemporada");
            return (Criteria) this;
        }

        public Criteria andIdUMDIsNull() {
            addCriterion("IdUMD is null");
            return (Criteria) this;
        }

        public Criteria andIdUMDIsNotNull() {
            addCriterion("IdUMD is not null");
            return (Criteria) this;
        }

        public Criteria andIdUMDEqualTo(Integer value) {
            addCriterion("IdUMD =", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDNotEqualTo(Integer value) {
            addCriterion("IdUMD <>", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDGreaterThan(Integer value) {
            addCriterion("IdUMD >", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdUMD >=", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDLessThan(Integer value) {
            addCriterion("IdUMD <", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDLessThanOrEqualTo(Integer value) {
            addCriterion("IdUMD <=", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDIn(List<Integer> values) {
            addCriterion("IdUMD in", values, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDNotIn(List<Integer> values) {
            addCriterion("IdUMD not in", values, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDBetween(Integer value1, Integer value2) {
            addCriterion("IdUMD between", value1, value2, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDNotBetween(Integer value1, Integer value2) {
            addCriterion("IdUMD not between", value1, value2, "idUMD");
            return (Criteria) this;
        }

        public Criteria andPesoIsNull() {
            addCriterion("Peso is null");
            return (Criteria) this;
        }

        public Criteria andPesoIsNotNull() {
            addCriterion("Peso is not null");
            return (Criteria) this;
        }

        public Criteria andPesoEqualTo(BigDecimal value) {
            addCriterion("Peso =", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotEqualTo(BigDecimal value) {
            addCriterion("Peso <>", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoGreaterThan(BigDecimal value) {
            addCriterion("Peso >", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Peso >=", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoLessThan(BigDecimal value) {
            addCriterion("Peso <", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Peso <=", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoIn(List<BigDecimal> values) {
            addCriterion("Peso in", values, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotIn(List<BigDecimal> values) {
            addCriterion("Peso not in", values, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Peso between", value1, value2, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Peso not between", value1, value2, "peso");
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