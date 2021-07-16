<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
 <Employee_Details>
    <xsl:for-each select="ABCOrder/data-items/item">
     <xsl:if test="employee_salary &gt; 300000">
     <xsl:if test="employee_age &gt; 60">     
    	<employee>   
		     <name><xsl:value-of select="employee_name"/></name>	    
			 <salary><xsl:value-of select="employee_salary"/></salary>
			 <age><xsl:value-of select="employee_age"></xsl:value-of></age>
		 </employee> 
	 </xsl:if>
	 </xsl:if>
    </xsl:for-each>
 </Employee_Details>
</xsl:template>
</xsl:stylesheet>