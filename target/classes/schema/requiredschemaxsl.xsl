<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <body>
  <h2>My Employee Details</h2>
  <table border="1">
    <tr bgcolor="#9acd32">
      <th>Employee Name</th>
      <th>Age</th>
	  <th>Salary</th>
	  <th>id</th>
    </tr>
    <xsl:for-each select="ABCOrder/data-items/item">
    <tr>
      <td><xsl:value-of select="employee_name"/></td>
      <td><xsl:value-of select="employee_age"/></td>
	  <td><xsl:value-of select="employee_salary"/></td>
	  <td><xsl:value-of select="id"></xsl:value-of></td>
    </tr>
    </xsl:for-each>
  </table>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>