<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Preservation Planning - Data Management Planning</title>
<style type="text/css">
body {
	background-image: url('https://crunchify.com/bg.png');
}

table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 80%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

table.columnHeaderTable td:nth-child(even){
	background-color: #dddddd;
}

table.rowHeaderTable tr:nth-child(even) {
	background-color: #dddddd;
}


</style>
</head>
<body>
	<div id="administrativeData" class="topLevelContainer" align="center">
		<h3>Administrative Data</h3>
		${version} <br> ${date} <br>
		<div id="authors">${authors}</div>
		<div id="contactPersons">${contactPersons}</div>
	</div>
	<br>
	<div id="experimentData" class="topLevelContainer" align="center">
		<h3>Experiment data</h3>
	</div>
	<br>
	<div id="intelectualPropertyRights" class="topLevelContainer"
		align="center">
		<h3>Intellectual property rights</h3>
		<table style="width: 65%" class="rowHeaderTable">
			<tr>
				<th>License</th>
				<th>Link</th>
			</tr>
			<tr>
				<td>${license}</td>
				<td>${licenseLink}</td>
			</tr>
		</table>
	</div>
	<br>
	<div id="ethics" class="topLevelContainer" align="center">
		<h3>Ethics</h3>
		<table style="width: 65%" class="columnHeaderTable">
			<tr>
				<th>Is personal/critical data included in this experiment?</th>
				<td>${personalData}</td>
			</tr>
			<tr>
				<th>Until when will the data be stored?</th>
				<td>${storedUntil}</td>
			</tr>
			<tr>
				<th>Which is encryption is used for the data?</th>
				<td>${encryption}</td>
			</tr>
		</table>
	</div>
	<br>
	<div id="backups" class="topLevelContainer" align="center">
		<h3>Backups</h3>
		<table style="width: 65%" class="rowHeaderTable">
			<tr>
				<th>Backup number</th>
				<th>Type of backup</th>
				<th>Responsible person</th>
				<th>Backup link</th>
				<th>Next backup</th>
			</tr>
			${backups}
		</table>

	</div>

</body>
</html>