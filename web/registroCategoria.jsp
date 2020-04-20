<%-- 
    Document   : registroCategoria
    Created on : 14-abr-2020, 22:11:56
    Author     : JK Gzenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Categorias</title>
        <%@include file="../css.jsp"%>
    </head>
    <body>
        <%@include file="../menu.jsp"%>
        <div class ="form-control">
            <div class="table-header">
                Desde aquí puede añadir o eliminar una Categoría
            </div>
            </br>
            <div>
                <form action="CategoriaController" method="post" class="form-horizontal"
                      </br>
                      </br>
                      <div class="form-group">
                          <label class="col-sm-control-label no-padding-right">
                          <label class="col-sm-1">
                              Nombre:
                          </label>
                          <div class="col-sm-3">
                              <input type="text" name="nombre" value="" placeholder="Nombre de Categoría"/>
                          </div>
                      </div>
                      </br>
                      <div class="col-sm-3">
                          <button name="Registrar" class="btn btn-outline-success" type="submit" value="Registrar"
                                <i>
                                    <svg class="bi bi-pen" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M5.707 13.707a1 1 0 01-.39.242l-3 1a1 1 0 01-1.266-1.265l1-3a1 1 0 01.242-.391L10.086 2.5a2 2 0 012.828 0l.586.586a2 2 0 010 2.828l-7.793 7.793zM3 11l7.793-7.793a1 1 0 011.414 0l.586.586a1 1 0 010 1.414L5 13l-3 1 1-3z" clip-rule="evenodd"/>
                                        <path fill-rule="evenodd" d="M9.854 2.56a.5.5 0 00-.708 0L5.854 5.855a.5.5 0 01-.708-.708L8.44 1.854a1.5 1.5 0 012.122 0l.293.292a.5.5 0 01-.707.708l-.293-.293z" clip-rule="evenodd"/>
                                        <path d="M13.293 1.207a1 1 0 011.414 0l.03.03a1 1 0 01.03 1.383L13.5 4 12 2.5l1.293-1.293z"/>
                                    </svg>
                                </i>
                                Registrar
                          </button>     
                          <button name="Eliminar" class="btn btn-outline-danger" type="submit" value="Eliminar"
                                <i>
                                    <svg class="bi bi-trash" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M5.5 5.5A.5.5 0 016 6v6a.5.5 0 01-1 0V6a.5.5 0 01.5-.5zm2.5 0a.5.5 0 01.5.5v6a.5.5 0 01-1 0V6a.5.5 0 01.5-.5zm3 .5a.5.5 0 00-1 0v6a.5.5 0 001 0V6z"/>
                                        <path fill-rule="evenodd" d="M14.5 3a1 1 0 01-1 1H13v9a2 2 0 01-2 2H5a2 2 0 01-2-2V4h-.5a1 1 0 01-1-1V2a1 1 0 011-1H6a1 1 0 011-1h2a1 1 0 011 1h3.5a1 1 0 011 1v1zM4.118 4L4 4.059V13a1 1 0 001 1h6a1 1 0 001-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z" clip-rule="evenodd"/>
                                    </svg>
                                </i>
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