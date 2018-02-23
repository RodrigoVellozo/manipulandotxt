<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script type="text/javascript"	src="https://code.jquery.com/jquery-3.1.0.js"></script>
<script type="text/javascript"	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="text/javascript"	src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">


<title>RecargaJá</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

	<div class="container-fluid">
		<div class="well">
			<h2>Recarga Já</h2>
		</div><!-- fecha well cabecalho -->

		<div class="col-md-4">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title">RECARGA</div>

				</div>
				<div class="panel-body">
					<form action="ControleRecarga?cmd=cadastrar" method="post" role="form">
						<label for="data">Data da Recarga:</label>
						<input type="date" name="data" id="data" title="Informe a data" placeholder="Digite a data de nascimento" required="required" class="form-control">
						
						<label for="recarga">Nº da recarga:</label>
						<input type="text" name="recarga" id="recarga" placeholder="informe um nº com 8 dígitos" maxlength="8" required="required" class="form-control">
						
						<label for="status">Status:</label>
						<select name="status" id="status" class="form-control" required="required">
							<option value="ativa" selected="selected">Ativa</option>
							<option value="pendente">Pendente</option>
							<option value="cancelada">Cancelada</option>
						</select><br>
						<button type="submit" class="btn btn-info btn-xs" title="clique para gravar"> <i class="fa fa-coffee"></i>&nbsp;Gravar</button>
						<br>
					</form>

					

				</div><!-- FECHA PANEL-BODY -->
				<div class="alert alert-success" role="alert">
						<strong>${msg }</strong>
					</div><!-- FECHA DIV - ALERT -->
			</div><!-- FECHA PINAL-PRIMARY -->
		</div><!-- FECHA A COLUNA -->
		
		
		<!-- CONSULTAR -->
		<div class="col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="panel-title">CONSULTAR RECARGAS</div>
				</div>
				<div class="panel-body">
					<form action="ControleRecarga?cmd=listar" method="post" role="form">
						<button type="submit"  class="btn btn-info" title="clique para listar" >&nbsp;Listar Recargas</button>
					</form>

					<c:if test="${fn:length(lista) > 0 }">
						<table class="table table-hover">
							<thead>
							<tr>
								<th scope="col">DADOS DA RECARGA</th>
							</tr>
							</thead>
							<c:forEach items="${lista }" var="recarga">
							<tbody>
								<tr>
									<td scope="row">${recarga}</td>
								</tr>
							</tbody>
							</c:forEach>
						</table>
					</c:if>

				</div>
				
			</div>
		</div>
		</div><!-- FECHA CONTAINER -->

</body>
</html>