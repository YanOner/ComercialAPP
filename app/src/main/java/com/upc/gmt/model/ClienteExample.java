package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClienteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClienteExample() {
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

        public Criteria andNombresIsNull() {
            addCriterion("Nombres is null");
            return (Criteria) this;
        }

        public Criteria andNombresIsNotNull() {
            addCriterion("Nombres is not null");
            return (Criteria) this;
        }

        public Criteria andNombresEqualTo(String value) {
            addCriterion("Nombres =", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotEqualTo(String value) {
            addCriterion("Nombres <>", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThan(String value) {
            addCriterion("Nombres >", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThanOrEqualTo(String value) {
            addCriterion("Nombres >=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThan(String value) {
            addCriterion("Nombres <", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThanOrEqualTo(String value) {
            addCriterion("Nombres <=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLike(String value) {
            addCriterion("Nombres like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotLike(String value) {
            addCriterion("Nombres not like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresIn(List<String> values) {
            addCriterion("Nombres in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotIn(List<String> values) {
            addCriterion("Nombres not in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresBetween(String value1, String value2) {
            addCriterion("Nombres between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotBetween(String value1, String value2) {
            addCriterion("Nombres not between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoIsNull() {
            addCriterion("ApellidoPaterno is null");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoIsNotNull() {
            addCriterion("ApellidoPaterno is not null");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoEqualTo(String value) {
            addCriterion("ApellidoPaterno =", value, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoNotEqualTo(String value) {
            addCriterion("ApellidoPaterno <>", value, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoGreaterThan(String value) {
            addCriterion("ApellidoPaterno >", value, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoGreaterThanOrEqualTo(String value) {
            addCriterion("ApellidoPaterno >=", value, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoLessThan(String value) {
            addCriterion("ApellidoPaterno <", value, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoLessThanOrEqualTo(String value) {
            addCriterion("ApellidoPaterno <=", value, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoLike(String value) {
            addCriterion("ApellidoPaterno like", value, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoNotLike(String value) {
            addCriterion("ApellidoPaterno not like", value, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoIn(List<String> values) {
            addCriterion("ApellidoPaterno in", values, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoNotIn(List<String> values) {
            addCriterion("ApellidoPaterno not in", values, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoBetween(String value1, String value2) {
            addCriterion("ApellidoPaterno between", value1, value2, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoPaternoNotBetween(String value1, String value2) {
            addCriterion("ApellidoPaterno not between", value1, value2, "apellidoPaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoIsNull() {
            addCriterion("ApellidoMaterno is null");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoIsNotNull() {
            addCriterion("ApellidoMaterno is not null");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoEqualTo(String value) {
            addCriterion("ApellidoMaterno =", value, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoNotEqualTo(String value) {
            addCriterion("ApellidoMaterno <>", value, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoGreaterThan(String value) {
            addCriterion("ApellidoMaterno >", value, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoGreaterThanOrEqualTo(String value) {
            addCriterion("ApellidoMaterno >=", value, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoLessThan(String value) {
            addCriterion("ApellidoMaterno <", value, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoLessThanOrEqualTo(String value) {
            addCriterion("ApellidoMaterno <=", value, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoLike(String value) {
            addCriterion("ApellidoMaterno like", value, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoNotLike(String value) {
            addCriterion("ApellidoMaterno not like", value, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoIn(List<String> values) {
            addCriterion("ApellidoMaterno in", values, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoNotIn(List<String> values) {
            addCriterion("ApellidoMaterno not in", values, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoBetween(String value1, String value2) {
            addCriterion("ApellidoMaterno between", value1, value2, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andApellidoMaternoNotBetween(String value1, String value2) {
            addCriterion("ApellidoMaterno not between", value1, value2, "apellidoMaterno");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoIsNull() {
            addCriterion("FechaNacimiento is null");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoIsNotNull() {
            addCriterion("FechaNacimiento is not null");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoEqualTo(Date value) {
            addCriterionForJDBCDate("FechaNacimiento =", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaNacimiento <>", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaNacimiento >", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaNacimiento >=", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoLessThan(Date value) {
            addCriterionForJDBCDate("FechaNacimiento <", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaNacimiento <=", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoIn(List<Date> values) {
            addCriterionForJDBCDate("FechaNacimiento in", values, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaNacimiento not in", values, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaNacimiento between", value1, value2, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaNacimiento not between", value1, value2, "fechaNacimiento");
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

        public Criteria andNroDocumentoIdentidadIsNull() {
            addCriterion("NroDocumentoIdentidad is null");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadIsNotNull() {
            addCriterion("NroDocumentoIdentidad is not null");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadEqualTo(String value) {
            addCriterion("NroDocumentoIdentidad =", value, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadNotEqualTo(String value) {
            addCriterion("NroDocumentoIdentidad <>", value, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadGreaterThan(String value) {
            addCriterion("NroDocumentoIdentidad >", value, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadGreaterThanOrEqualTo(String value) {
            addCriterion("NroDocumentoIdentidad >=", value, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadLessThan(String value) {
            addCriterion("NroDocumentoIdentidad <", value, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadLessThanOrEqualTo(String value) {
            addCriterion("NroDocumentoIdentidad <=", value, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadLike(String value) {
            addCriterion("NroDocumentoIdentidad like", value, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadNotLike(String value) {
            addCriterion("NroDocumentoIdentidad not like", value, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadIn(List<String> values) {
            addCriterion("NroDocumentoIdentidad in", values, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadNotIn(List<String> values) {
            addCriterion("NroDocumentoIdentidad not in", values, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadBetween(String value1, String value2) {
            addCriterion("NroDocumentoIdentidad between", value1, value2, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andNroDocumentoIdentidadNotBetween(String value1, String value2) {
            addCriterion("NroDocumentoIdentidad not between", value1, value2, "nroDocumentoIdentidad");
            return (Criteria) this;
        }

        public Criteria andRUCIsNull() {
            addCriterion("RUC is null");
            return (Criteria) this;
        }

        public Criteria andRUCIsNotNull() {
            addCriterion("RUC is not null");
            return (Criteria) this;
        }

        public Criteria andRUCEqualTo(String value) {
            addCriterion("RUC =", value, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCNotEqualTo(String value) {
            addCriterion("RUC <>", value, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCGreaterThan(String value) {
            addCriterion("RUC >", value, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCGreaterThanOrEqualTo(String value) {
            addCriterion("RUC >=", value, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCLessThan(String value) {
            addCriterion("RUC <", value, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCLessThanOrEqualTo(String value) {
            addCriterion("RUC <=", value, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCLike(String value) {
            addCriterion("RUC like", value, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCNotLike(String value) {
            addCriterion("RUC not like", value, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCIn(List<String> values) {
            addCriterion("RUC in", values, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCNotIn(List<String> values) {
            addCriterion("RUC not in", values, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCBetween(String value1, String value2) {
            addCriterion("RUC between", value1, value2, "RUC");
            return (Criteria) this;
        }

        public Criteria andRUCNotBetween(String value1, String value2) {
            addCriterion("RUC not between", value1, value2, "RUC");
            return (Criteria) this;
        }

        public Criteria andCelularIsNull() {
            addCriterion("Celular is null");
            return (Criteria) this;
        }

        public Criteria andCelularIsNotNull() {
            addCriterion("Celular is not null");
            return (Criteria) this;
        }

        public Criteria andCelularEqualTo(String value) {
            addCriterion("Celular =", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularNotEqualTo(String value) {
            addCriterion("Celular <>", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularGreaterThan(String value) {
            addCriterion("Celular >", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularGreaterThanOrEqualTo(String value) {
            addCriterion("Celular >=", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularLessThan(String value) {
            addCriterion("Celular <", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularLessThanOrEqualTo(String value) {
            addCriterion("Celular <=", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularLike(String value) {
            addCriterion("Celular like", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularNotLike(String value) {
            addCriterion("Celular not like", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularIn(List<String> values) {
            addCriterion("Celular in", values, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularNotIn(List<String> values) {
            addCriterion("Celular not in", values, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularBetween(String value1, String value2) {
            addCriterion("Celular between", value1, value2, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularNotBetween(String value1, String value2) {
            addCriterion("Celular not between", value1, value2, "celular");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionIsNull() {
            addCriterion("FechaCreacion is null");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionIsNotNull() {
            addCriterion("FechaCreacion is not null");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionEqualTo(Date value) {
            addCriterionForJDBCDate("FechaCreacion =", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaCreacion <>", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaCreacion >", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaCreacion >=", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionLessThan(Date value) {
            addCriterionForJDBCDate("FechaCreacion <", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaCreacion <=", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionIn(List<Date> values) {
            addCriterionForJDBCDate("FechaCreacion in", values, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaCreacion not in", values, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaCreacion between", value1, value2, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaCreacion not between", value1, value2, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualIsNull() {
            addCriterion("LineaCreditoActual is null");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualIsNotNull() {
            addCriterion("LineaCreditoActual is not null");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualEqualTo(Double value) {
            addCriterion("LineaCreditoActual =", value, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualNotEqualTo(Double value) {
            addCriterion("LineaCreditoActual <>", value, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualGreaterThan(Double value) {
            addCriterion("LineaCreditoActual >", value, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualGreaterThanOrEqualTo(Double value) {
            addCriterion("LineaCreditoActual >=", value, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualLessThan(Double value) {
            addCriterion("LineaCreditoActual <", value, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualLessThanOrEqualTo(Double value) {
            addCriterion("LineaCreditoActual <=", value, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualIn(List<Double> values) {
            addCriterion("LineaCreditoActual in", values, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualNotIn(List<Double> values) {
            addCriterion("LineaCreditoActual not in", values, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualBetween(Double value1, Double value2) {
            addCriterion("LineaCreditoActual between", value1, value2, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoActualNotBetween(Double value1, Double value2) {
            addCriterion("LineaCreditoActual not between", value1, value2, "lineaCreditoActual");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoIsNull() {
            addCriterion("SaldoLineaCredito is null");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoIsNotNull() {
            addCriterion("SaldoLineaCredito is not null");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoEqualTo(Double value) {
            addCriterion("SaldoLineaCredito =", value, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoNotEqualTo(Double value) {
            addCriterion("SaldoLineaCredito <>", value, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoGreaterThan(Double value) {
            addCriterion("SaldoLineaCredito >", value, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoGreaterThanOrEqualTo(Double value) {
            addCriterion("SaldoLineaCredito >=", value, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoLessThan(Double value) {
            addCriterion("SaldoLineaCredito <", value, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoLessThanOrEqualTo(Double value) {
            addCriterion("SaldoLineaCredito <=", value, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoIn(List<Double> values) {
            addCriterion("SaldoLineaCredito in", values, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoNotIn(List<Double> values) {
            addCriterion("SaldoLineaCredito not in", values, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoBetween(Double value1, Double value2) {
            addCriterion("SaldoLineaCredito between", value1, value2, "saldoLineaCredito");
            return (Criteria) this;
        }

        public Criteria andSaldoLineaCreditoNotBetween(Double value1, Double value2) {
            addCriterion("SaldoLineaCredito not between", value1, value2, "saldoLineaCredito");
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