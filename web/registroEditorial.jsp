<%-- 
    Document   : registroEditorial
    Created on : 28-nov-2018, 11:12:57
    Author     : JK Gzenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Editoriales</title>
        <%@include file="../css.jsp"%>
    </head>
    <body>
    <%@include file="../menu.jsp"%>
        <div class ="form-control">
            <div class="table-header">
                Desde aquí puede añadir o eliminar una Editorial
            </div>
            <div>
                <form action="EditorialController" method="post" class="form-horizontal"
                      </br>
                      </br>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Nombre:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="nombre" value="" placeholder=""/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Nit:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="nit" value="" placeholder=""/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Teléfono:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="telefono" value="" placeholder=""/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Dirección:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="direccion" value="" placeholder=""/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Email:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="email" value="" placeholder=""/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-3 control-label no-padding-right">
                              Sitio Web:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="sitioweb" value="" placeholder=""/>
                          </div>
                      </div>
                      <br>
                      <div class="col-sm3">
                          <button name="Registrar" class="btn btn-success" type="submit" value="Registrar"
                                      <i class="fa fa-save"></i>
                                      Registrar
                          </button>  
                          <button name="Actualizar" class="btn btn-warning" type="submit" value="Actualizar"
                                      <i></i>
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
