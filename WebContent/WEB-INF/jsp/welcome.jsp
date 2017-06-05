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
</style>
</head>
<body>
	<div id="administrativeData" class="topLevelContainer" align="center">
	${version}
	${date}
	<br>
		<div id ="authors">
		${authors}
		</div>
		<div id ="contactPersons">
		${contactPersons}
		</div>
	</div>
	<br>
	<div id="experimentData" class="topLevelContainer"  align="center">
	
	</div>
	<br>
	<div id="intelectualPropertyRights" class="topLevelContainer"  align="center">
	
	</div>
	<br>
	<div id="ethics" class="topLevelContainer"  align="center">
	<!--  ${ethics}-->
	</div>
	<br>
	<div id="backups" class="topLevelContainer"  align="center">
	
	</div>
	
</body>
</html>