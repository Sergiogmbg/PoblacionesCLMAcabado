<%-- 
    Document   : pueblos
    Created on : 10-feb-2020, 21:14:42
    Author     : Usuario1
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <form action="Poblaciones" method="post">
            <% String provincia_activa = (String) request.getAttribute("provincia");
                ArrayList<String> pueblos = (ArrayList<String>) request.getAttribute("pueblos");
                ArrayList<String> provincias = (ArrayList<String>) request.getAttribute("provincias");
            %>
            <h2>Pueblos de Castilla-La Mancha</h2>

            <h3>Provincia Activa: <%=provincia_activa%></h3><br>

            <nav class="nav nav-pills nav-fill">
                <% for (int p = 0; p < provincias.size(); p++) {%>
                <a class="nav-item nav-link active" href="Poblaciones?provincia=<%=provincias.get(p)%>"><%=provincias.get(p)%></a>
                <%}%>
            </nav>
            <br>
            Provincias:<select name="provincias">

                <% for (int n = 0; n < provincias.size(); n++) {%>
                <a href="Poblaciones?provincia=<%=provincias.get(n)%>"><%=provincias.get(n)%></a>

                <% String cadenaSelected = "";
                    if (provincia_activa.equals(provincias.get(n))) {
                        cadenaSelected = "selected";
                    }
                %>
                <option <%= cadenaSelected%> value="<%=provincias.get(n)%>"><%=provincias.get(n)%></option>         
                <%}%>
            </select>

            Pueblos:<select name="pueblos">
                <% for (int i = 0; i < pueblos.size(); i++) {%>
                <option value="<%=pueblos.get(i)%>"><%=pueblos.get(i)%></option>       
                <%}%>
            </select>

            <input type="submit" value="Enviar">
        </form>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
