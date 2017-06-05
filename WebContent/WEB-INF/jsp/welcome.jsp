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
	width: 100%;
	margin: auto;
}

#intro {
	font-family: arial, sans-serif;
	font-size: 16px;
	margin: auto;
	width: 65%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

table.rowHeaderTable tr:nth-child(even) {
	background-color: #dddddd;
}

.topLevelContainer {
	margin: auto;
	width: 65%;
	border: 3px solid #2C3539;
	padding: 10px;
}

h3 {
	color: #2C3539;
}
</style>
</head>
<body>
	<h1 align="center">Data management plan</h1>
	<div id="intro">
		<p>
			This experiment has been done within the scope of the lecture
			"Digital preservation" at the university TU Wien. To re-create the
			output you will first of all need to take the input data provided <a
				href="${storedAt}">here</a>. You will also need a MySQL database
			running on your local machine as the R-script is executing a create
			table statement and then inserting data from the input files to those
			tables. At the end it creates some plots which can be saved as
			images. The R-script and the outputs can also be found at the same
			location like above. Please note that we have put some restrictions to the used
			data in order to avoid unsupported views. The input files may only be
			csv-files. We use specific information like row and column numbers
			for this file-format in our schema. The generated output files are
			always png-files. The transformation is done with an R-script. If you
			do the processing in another scripting language, please adapt the
			language in the dmp-document-xml, so that the used language will be
			displayed. You can find this restrictions in the dmp-schema.xsd
		</p>
		<p>If you want to try out other experiments with same input and
			output formats, feel free, but in this case please adapt the intput,
			transformation and output data in the dmp-document.xml. Have in mind
			that this document should provide all the important information in
			the context of Data management planning for this experiment</p>
	</div>
	<div id="administrativeData" class="topLevelContainer">
		<h3 align="center">Administrative Data</h3>
		<table class="columnHeaderTable">
			<tr>
				<th>Experiment version</th>
				<td>${version}</td>
			</tr>
			<tr>
				<th>Date of experiment</th>
				<td>${date}</td>
			</tr>
			<tr>
				<th>Authors</th>
				<td>${authors}</td>
			</tr>
			<tr>
				<th>Contact persons</th>
				<td>${contactPersons}</td>
			</tr>

		</table>
	</div>
	<br>
	<div id="experimentData" class="topLevelContainer">
		<h3 align="center">Experiment data</h3>
		<table class="columnHeaderTable">
			<tr>
				<th>Location of experiment data</th>
				<td><a href="${storedAt}">${storedAt}</a> </dh>
			</tr>
			<tr>
				<th>Size of experiment data</th>
				<td>${volumeInKB}</td>
			</tr>

		</table>
	</div>
	<br>
	<div id="intelectualPropertyRights" class="topLevelContainer">
		<h3 align="center">Intellectual property rights</h3>
		<table class="columnHeaderTable">
			<tr>
				<th>License</th>
				<td>${license}</td>
			</tr>
			<tr>
				<th>Link</th>
				<td><a href="${licenseLink}">${licenseLink}</a></td>
			</tr>
		</table>
	</div>
	<br>
	<div id="ethics" class="topLevelContainer">
		<h3 align="center">Ethics</h3>
		<table class="columnHeaderTable">
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
	<div id="backups" class="topLevelContainer">
		<h3 align="center">Backups</h3>
		<table class="rowHeaderTable">
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