<%-- 
    Document   : listarLibros
    Created on : 29-nov-2018, 16:53:33
    Author     : JK Gzenna
--%>

<%@page import="dao.CategoriaDAO"%>
<%@page import="dao.EditorialDAO"%>
<%@page import="dao.LibroDAO"%>
<%@page import="models.Libro"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Libros</title>
        <%@include file="../css.jsp"%>
    </head>
    
    <body>
        <%@include file="../menu.jsp"%>
        
        <div class="table-header">
            Listado de Libros Registrados
        </div>
        
        <div>
            <table id="dynamic-table" class="table table-striped table-bordered table-hover">
                <thead>
                    <tr>
                        <th>ISBN</th>
                        <th>Título del Libro</th>
                        <th>Autor</th>
                        <th>Fecha de Publicación</th>
                        <th>Editorial</th>
                        <th>Categoría</th>
                    </tr>
                </thead>
                <tbody>
                    <% for(Libro l:LibroDAO.listar()){%>
                    <tr>
                        <td><%= l.getIsbn()%></td>
                        <td><%= l.getTitulo()%></td>
                        <td><%= l.getNombre_autor()%></td>
                        <td><%= l.getPublicacion()%></td>
                        <td><%= EditorialDAO.getEditorial(l.getNit_editorial())%></td>
                        <td><%= CategoriaDAO.getCategoria(l.getCodigo_categoria()) %></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </div>
    </body>
</html>
