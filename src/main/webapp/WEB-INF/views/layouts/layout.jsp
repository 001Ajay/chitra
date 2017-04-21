<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
	</head>
	<body>

		<div>
			<tiles:insertAttribute name="header" />
		</div>
		<div style="float: left; padding: 10px; width: 15%;">
			<tiles:insertAttribute name="menu" />
		</div>
		<div style="float: left; padding: 10px; width: 80%; border-left: 1px solid pink;">
			<tiles:insertAttribute name="content" />
		</div>
		<div style="clear: both">
			<tiles:insertAttribute name="footer" />
		</div>
	
	</body>
</html>