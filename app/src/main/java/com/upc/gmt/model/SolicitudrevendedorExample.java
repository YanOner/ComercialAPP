package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SolicitudrevendedorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SolicitudrevendedorExample() {
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

        public Criteria andIdSolicitudIsNull() {
            addCriterion("IdSolicitud is null");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudIsNotNull() {
            addCriterion("IdSolicitud is not null");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudEqualTo(Integer value) {
            addCriterion("IdSolicitud =", value, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudNotEqualTo(Integer value) {
            addCriterion("IdSolicitud <>", value, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudGreaterThan(Integer value) {
            addCriterion("IdSolicitud >", value, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdSolicitud >=", value, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudLessThan(Integer value) {
            addCriterion("IdSolicitud <", value, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudLessThanOrEqualTo(Integer value) {
            addCriterion("IdSolicitud <=", value, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudIn(List<Integer> values) {
            addCriterion("IdSolicitud in", values, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudNotIn(List<Integer> values) {
            addCriterion("IdSolicitud not in", values, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudBetween(Integer value1, Integer value2) {
            addCriterion("IdSolicitud between", value1, value2, "idSolicitud");
            return (Criteria) this;
        }

        public Criteria andIdSolicitudNotBetween(Integer value1, Integer value2) {
            addCriterion("IdSolicitud not between", value1, value2, "idSolicitud");
            return (Criteria) this;
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

        public Criteria andCodUsuarioIsNull() {
            addCriterion("CodUsuario is null");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioIsNotNull() {
            addCriterion("CodUsuario is not null");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioEqualTo(String value) {
            addCriterion("CodUsuario =", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioNotEqualTo(String value) {
            addCriterion("CodUsuario <>", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioGreaterThan(String value) {
            addCriterion("CodUsuario >", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("CodUsuario >=", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioLessThan(String value) {
            addCriterion("CodUsuario <", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioLessThanOrEqualTo(String value) {
            addCriterion("CodUsuario <=", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioLike(String value) {
            addCriterion("CodUsuario like", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioNotLike(String value) {
            addCriterion("CodUsuario not like", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioIn(List<String> values) {
            addCriterion("CodUsuario in", values, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioNotIn(List<String> values) {
            addCriterion("CodUsuario not in", values, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioBetween(String value1, String value2) {
            addCriterion("CodUsuario between", value1, value2, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioNotBetween(String value1, String value2) {
            addCriterion("CodUsuario not between", value1, value2, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudIsNull() {
            addCriterion("FechaSolicitud is null");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudIsNotNull() {
            addCriterion("FechaSolicitud is not null");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudEqualTo(Date value) {
            addCriterionForJDBCDate("FechaSolicitud =", value, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaSolicitud <>", value, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaSolicitud >", value, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaSolicitud >=", value, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudLessThan(Date value) {
            addCriterionForJDBCDate("FechaSolicitud <", value, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaSolicitud <=", value, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudIn(List<Date> values) {
            addCriterionForJDBCDate("FechaSolicitud in", values, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaSolicitud not in", values, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaSolicitud between", value1, value2, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaSolicitudNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaSolicitud not between", value1, value2, "fechaSolicitud");
            return (Criteria) this;
        }

        public Criteria andComentarioIsNull() {
            addCriterion("Comentario is null");
            return (Criteria) this;
        }

        public Criteria andComentarioIsNotNull() {
            addCriterion("Comentario is not null");
            return (Criteria) this;
        }

        public Criteria andComentarioEqualTo(String value) {
            addCriterion("Comentario =", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioNotEqualTo(String value) {
            addCriterion("Comentario <>", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioGreaterThan(String value) {
            addCriterion("Comentario >", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioGreaterThanOrEqualTo(String value) {
            addCriterion("Comentario >=", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioLessThan(String value) {
            addCriterion("Comentario <", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioLessThanOrEqualTo(String value) {
            addCriterion("Comentario <=", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioLike(String value) {
            addCriterion("Comentario like", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioNotLike(String value) {
            addCriterion("Comentario not like", value, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioIn(List<String> values) {
            addCriterion("Comentario in", values, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioNotIn(List<String> values) {
            addCriterion("Comentario not in", values, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioBetween(String value1, String value2) {
            addCriterion("Comentario between", value1, value2, "comentario");
            return (Criteria) this;
        }

        public Criteria andComentarioNotBetween(String value1, String value2) {
            addCriterion("Comentario not between", value1, value2, "comentario");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioIsNull() {
            addCriterion("MontoCompraPromedio is null");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioIsNotNull() {
            addCriterion("MontoCompraPromedio is not null");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioEqualTo(BigDecimal value) {
            addCriterion("MontoCompraPromedio =", value, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioNotEqualTo(BigDecimal value) {
            addCriterion("MontoCompraPromedio <>", value, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioGreaterThan(BigDecimal value) {
            addCriterion("MontoCompraPromedio >", value, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoCompraPromedio >=", value, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioLessThan(BigDecimal value) {
            addCriterion("MontoCompraPromedio <", value, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MontoCompraPromedio <=", value, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioIn(List<BigDecimal> values) {
            addCriterion("MontoCompraPromedio in", values, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioNotIn(List<BigDecimal> values) {
            addCriterion("MontoCompraPromedio not in", values, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoCompraPromedio between", value1, value2, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andMontoCompraPromedioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MontoCompraPromedio not between", value1, value2, "montoCompraPromedio");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudIsNull() {
            addCriterion("UsuarioGeneroSolicitud is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudIsNotNull() {
            addCriterion("UsuarioGeneroSolicitud is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudEqualTo(String value) {
            addCriterion("UsuarioGeneroSolicitud =", value, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudNotEqualTo(String value) {
            addCriterion("UsuarioGeneroSolicitud <>", value, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudGreaterThan(String value) {
            addCriterion("UsuarioGeneroSolicitud >", value, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudGreaterThanOrEqualTo(String value) {
            addCriterion("UsuarioGeneroSolicitud >=", value, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudLessThan(String value) {
            addCriterion("UsuarioGeneroSolicitud <", value, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudLessThanOrEqualTo(String value) {
            addCriterion("UsuarioGeneroSolicitud <=", value, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudLike(String value) {
            addCriterion("UsuarioGeneroSolicitud like", value, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudNotLike(String value) {
            addCriterion("UsuarioGeneroSolicitud not like", value, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudIn(List<String> values) {
            addCriterion("UsuarioGeneroSolicitud in", values, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudNotIn(List<String> values) {
            addCriterion("UsuarioGeneroSolicitud not in", values, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudBetween(String value1, String value2) {
            addCriterion("UsuarioGeneroSolicitud between", value1, value2, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroSolicitudNotBetween(String value1, String value2) {
            addCriterion("UsuarioGeneroSolicitud not between", value1, value2, "usuarioGeneroSolicitud");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaIsNull() {
            addCriterion("FechaRespuesta is null");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaIsNotNull() {
            addCriterion("FechaRespuesta is not null");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaEqualTo(Date value) {
            addCriterionForJDBCDate("FechaRespuesta =", value, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaRespuesta <>", value, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaRespuesta >", value, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaRespuesta >=", value, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaLessThan(Date value) {
            addCriterionForJDBCDate("FechaRespuesta <", value, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaRespuesta <=", value, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaIn(List<Date> values) {
            addCriterionForJDBCDate("FechaRespuesta in", values, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaRespuesta not in", values, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaRespuesta between", value1, value2, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andFechaRespuestaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaRespuesta not between", value1, value2, "fechaRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaIsNull() {
            addCriterion("UsuarioRespuesta is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaIsNotNull() {
            addCriterion("UsuarioRespuesta is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaEqualTo(String value) {
            addCriterion("UsuarioRespuesta =", value, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaNotEqualTo(String value) {
            addCriterion("UsuarioRespuesta <>", value, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaGreaterThan(String value) {
            addCriterion("UsuarioRespuesta >", value, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaGreaterThanOrEqualTo(String value) {
            addCriterion("UsuarioRespuesta >=", value, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaLessThan(String value) {
            addCriterion("UsuarioRespuesta <", value, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaLessThanOrEqualTo(String value) {
            addCriterion("UsuarioRespuesta <=", value, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaLike(String value) {
            addCriterion("UsuarioRespuesta like", value, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaNotLike(String value) {
            addCriterion("UsuarioRespuesta not like", value, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaIn(List<String> values) {
            addCriterion("UsuarioRespuesta in", values, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaNotIn(List<String> values) {
            addCriterion("UsuarioRespuesta not in", values, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaBetween(String value1, String value2) {
            addCriterion("UsuarioRespuesta between", value1, value2, "usuarioRespuesta");
            return (Criteria) this;
        }

        public Criteria andUsuarioRespuestaNotBetween(String value1, String value2) {
            addCriterion("UsuarioRespuesta not between", value1, value2, "usuarioRespuesta");
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

        public Criteria andLineaCreditoIsNull() {
            addCriterion("LineaCredito is null");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoIsNotNull() {
            addCriterion("LineaCredito is not null");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoEqualTo(BigDecimal value) {
            addCriterion("LineaCredito =", value, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoNotEqualTo(BigDecimal value) {
            addCriterion("LineaCredito <>", value, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoGreaterThan(BigDecimal value) {
            addCriterion("LineaCredito >", value, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LineaCredito >=", value, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoLessThan(BigDecimal value) {
            addCriterion("LineaCredito <", value, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LineaCredito <=", value, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoIn(List<BigDecimal> values) {
            addCriterion("LineaCredito in", values, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoNotIn(List<BigDecimal> values) {
            addCriterion("LineaCredito not in", values, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LineaCredito between", value1, value2, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LineaCredito not between", value1, value2, "lineaCredito");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorIsNull() {
            addCriterion("LineaCreditoAnterior is null");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorIsNotNull() {
            addCriterion("LineaCreditoAnterior is not null");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorEqualTo(BigDecimal value) {
            addCriterion("LineaCreditoAnterior =", value, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorNotEqualTo(BigDecimal value) {
            addCriterion("LineaCreditoAnterior <>", value, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorGreaterThan(BigDecimal value) {
            addCriterion("LineaCreditoAnterior >", value, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LineaCreditoAnterior >=", value, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorLessThan(BigDecimal value) {
            addCriterion("LineaCreditoAnterior <", value, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LineaCreditoAnterior <=", value, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorIn(List<BigDecimal> values) {
            addCriterion("LineaCreditoAnterior in", values, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorNotIn(List<BigDecimal> values) {
            addCriterion("LineaCreditoAnterior not in", values, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LineaCreditoAnterior between", value1, value2, "lineaCreditoAnterior");
            return (Criteria) this;
        }

        public Criteria andLineaCreditoAnteriorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LineaCreditoAnterior not between", value1, value2, "lineaCreditoAnterior");
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