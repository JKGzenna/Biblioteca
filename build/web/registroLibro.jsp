<%-- 
    Document   : registroLibro
    Created on : 28-nov-2018, 13:20:06
    Author     : JK Gzenna
--%>

<%@page import="dao.EditorialDAO"%>
<%@page import="models.Editorial"%>
<%@page import="dao.CategoriaDAO"%>
<%@page import="models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrao de Libros</title>
        <%@include file="../css.jsp"%>
    </head>
    <body>
    <%@include file="../menu.jsp"%>
        <div class ="form-control">
            <div class="table-header">
                Desde aquí puede añadir o eliminar un Libro
            </div>
            <div>
                <form action="LibroController" method="post" class="form-horizontal"
                      </br>
                      </br>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              ISBN:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="isbn" value="" placeholder=""/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Título de Libro:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="titulo" value="" placeholder=""/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Autor:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="autor" value="" placeholder=""/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Fecha de Publicación:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="publicacion" value="" placeholder="AAAA-MM-DD"/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                                                        <div class="form-group">
                                                            <label class="col-sm-3 control-label no-paddding-right">
                                                                Categoría:
                                                            </label>
                                                            <div class="col-sm-3">
                                                                <select name="categoria">
                                                                    <option value="0">Seleccione Categoria</option>
                                                                    <% for(Categoria c:CategoriaDAO.listar()){ %>
                                                                    <option value="<%= c.getCodigo()%>"><%= c.getNombre()%></option>
                                                                    <%}%>
                                                                </select>
                                                            </div> 
                                                        </div>
                                                        
                                                        <div class="form-group">
                                                            <label class="col-sm-3 control-label no-paddding-right">
                                                                Editorial:
                                                            </label>
                                                            <div class="col-sm-3">
                                                                <select name="editorial">
                                                                    <option value="0">Seleccione la Editorial</option>
                                                                    <% for(Editorial e:EditorialDAO.listar()){ %>
                                                                    <option value="<%= e.getNit()%>"><%= e.getNombre() %></option>
                                                                    <%}%>
                                                                </select>
                                                            </div> 
                                                        </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Descripcion:
                          </label>
                          <div class="col-sm-3">
                              <textarea 
                                  name="descripcion" rows="4" cols="25">
                              </textarea>
                          </div>
                      </div>
                      <br>
                      <div class="col-sm3">
                          <button name="Registrar" class="btn btn-success" type="submit" value="Registrar"
                                      <i class="fa fa-save"></i>
                                      Registrar
                          </button>  
                          <button name="Actualizar" class="btn btn-warning" type="submit" value="Actualizar"
                                      <i class="fa fa-edit"></i>
                                      Actualizar
                          </button>  
                          <button name="Eliminar" class="btn btn-danger" type="submit" value="Eliminar"
                                  <i class="fa fa-remove"></i>
                                      Eliminar
                          </button>    
                      </div>
                </form>
                <br>
                <%=(request.getAttribute("mensaje")!=null?request.getAttribute("mensaje"):"")%>
            </div>
        </div>
    </body>
</html>
