# Información sobre cada Gasolinera:

<table>
<colgroup>
<col style="width: 45%" />
<col style="width: 18%" />
<col style="width: 35%" />
</colgroup>
<thead>
<tr class="header">
<th>Nombre en JSON</th>
<th>Descripción</th>
<th>Ejemplo</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>"C.P.”</td>
<td></td>
<td>“39450“</td>
</tr>
<tr class="even">
<td>"Dirección"</td>
<td></td>
<td>"CARRETERA N-611 KM. 163,2"</td>
</tr>
<tr class="odd">
<td>"Horario"</td>
<td></td>
<td>"L-S: 07:30-21:30; D: 08:30-21:30"</td>
</tr>
<tr class="even">
<td>"Latitud"</td>
<td></td>
<td>"43,341889"</td>
</tr>
<tr class="odd">
<td>"Localidad"</td>
<td></td>
<td>"REINOSA"</td>
</tr>
<tr class="even">
<td>"Longitud (WGS84)"</td>
<td></td>
<td>"-4,131333"</td>
</tr>
<tr class="odd">
<td>"Margen"</td>
<td>Lado carretera</td>
<td>“I”, “D”</td>
</tr>
<tr class="even">
<td>"Municipio"</td>
<td></td>
<td>"Reinosa"</td>
</tr>
<tr class="odd">
<td>"Precio Biodiesel":</td>
<td></td>
<td rowspan="14">“1,494”, “”</td>
</tr>
<tr class="even">
<td>"Precio Bioetanol"</td>
<td></td>
</tr>
<tr class="odd">
<td>"Precio Gas Natural Comprimido"</td>
<td></td>
</tr>
<tr class="even">
<td>"Precio Gas Natural Licuado"</td>
<td></td>
</tr>
<tr class="odd">
<td>"Precio Gases licuados del petróleo"</td>
<td></td>
</tr>
<tr class="even">
<td>"Precio Gasoleo A"</td>
<td></td>
</tr>
<tr class="odd">
<td>"Precio Gasoleo B"</td>
<td></td>
</tr>
<tr class="even">
<td>"Precio Gasoleo Premium"</td>
<td></td>
</tr>
<tr class="odd">
<td>"Precio Gasolina 95 E10"</td>
<td></td>
</tr>
<tr class="even">
<td>"Precio Gasolina 95 E5"</td>
<td></td>
</tr>
<tr class="odd">
<td>"Precio Gasolina 95 E5 Premium"</td>
<td></td>
</tr>
<tr class="even">
<td>"Precio Gasolina 98 E10"</td>
<td></td>
</tr>
<tr class="odd">
<td>"Precio Gasolina 98 E5"</td>
<td></td>
</tr>
<tr class="even">
<td>"Precio Hidrogeno"</td>
<td></td>
</tr>
<tr class="odd">
<td>"Provincia"</td>
<td></td>
<td>“CANTABRIA”</td>
</tr>
<tr class="even">
<td>"Remisión"</td>
<td><a
href="https://www.boe.es/diario_boe/txt.php?id=BOE-A-2007-14592">Tipo
envío</a></td>
<td>“dm”, “OM”</td>
</tr>
<tr class="odd">
<td>"Rótulo"</td>
<td></td>
<td>“CEPSA”, “ES FERMAN LIAÑO”</td>
</tr>
<tr class="even">
<td>"Tipo Venta"</td>
<td></td>
<td>“P”</td>
</tr>
<tr class="odd">
<td>"% BioEtanol"</td>
<td></td>
<td>“0,0”</td>
</tr>
<tr class="even">
<td>"% Éster metílico"</td>
<td></td>
<td>“0,0”</td>
</tr>
<tr class="odd">
<td>"IDEESS"</td>
<td>ID Estación</td>
<td>“12610”</td>
</tr>
<tr class="even">
<td>"IDMunicipio"</td>
<td></td>
<td>“5786”</td>
</tr>
<tr class="odd">
<td>"IDProvincia"</td>
<td></td>
<td>“39”</td>
</tr>
<tr class="even">
<td>"IDCCAA"</td>
<td></td>
<td>“06”</td>
</tr>
</tbody>
</table>

# Servicios Disponibles

<https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/help>

<table>
<colgroup>
<col style="width: 29%" />
<col style="width: 34%" />
<col style="width: 36%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Título</strong></th>
<th><strong>Descripción</strong></th>
<th><strong>Filtros</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>EstacionesTerrestres</td>
<td>Estaciones de servicio para vehículos</td>
<td rowspan="3"><p>Todas</p>
<p>Filtro Comunidad</p>
<p>Filtro Municipio</p>
<p>Filtro Provincia</p>
<p>(+ filtro producto)</p></td>
</tr>
<tr class="even">
<td>EstacionesTerrestresHist</td>
<td><p>Información de Estaciones de servicio en una fecha</p>
<p>Formato: 13-08-2024</p></td>
</tr>
<tr class="odd">
<td>PostesMaritimos</td>
<td>Estaciones para barcos</td>
</tr>
<tr class="even">
<td>Listados</td>
<td>Listado de constantes</td>
<td><p>Comunidades Autónomas</p>
<p>Municipios</p>
<p>Municipios en Provincia</p>
<p>Productos</p>
<p>Provincias</p>
<p>Provincias en Comunidad</p></td>
</tr>
</tbody>
</table>

Endpoints:

<table>
<colgroup>
<col style="width: 100%" />
</colgroup>
<tbody>
<tr class="odd">
<td>EstacionesTerrestres/</td>
</tr>
<tr class="odd">
<td>EstacionesTerrestres/FiltroCCAA/{IDCCAA}</td>
</tr>
<tr class="even">
<td>EstacionesTerrestres/FiltroCCAAProducto/{IDCCAA}/{IDProducto}</td>
</tr>
<tr class="odd">
<td>EstacionesTerrestres/FiltroMunicipio/{IDMunicipio}</td>
</tr>
<tr class="even">
<td>EstacionesTerrestres/FiltroMunicipioProducto/{IDMunicipio}/{IDProducto}</td>
</tr>
<tr class="odd">
<td>EstacionesTerrestres/FiltroProducto/{IDProducto}</td>
</tr>
<tr class="even">
<td>EstacionesTerrestres/FiltroProvincia/{IDProvincia}</td>
</tr>
<tr class="odd">
<td>EstacionesTerrestres/FiltroProvinciaProducto/{IDProvincia}/{IDProducto}</td>
</tr>
<tr class="even">
<td>EstacionesTerrestresHist/{FECHA}</td>
</tr>
<tr class="odd">
<td>EstacionesTerrestresHist/FiltroCCAA/{FECHA}/{IDCCAA}</td>
</tr>
<tr class="even">
<td>EstacionesTerrestresHist/FiltroCCAAProducto/{FECHA}/{IDCCAA}/{IDProducto}</td>
</tr>
<tr class="odd">
<td>EstacionesTerrestresHist/FiltroMunicipio/{FECHA}/{IDMunicipio}</td>
</tr>
<tr class="even">
<td>EstacionesTerrestresHist/FiltroMunicipioProducto/{FECHA}/{IDMunicipio}/{IDProducto}</td>
</tr>
<tr class="odd">
<td>EstacionesTerrestresHist/FiltroProducto/{FECHA}/{IDProducto}</td>
</tr>
<tr class="even">
<td>EstacionesTerrestresHist/FiltroProvincia/{FECHA}/{IDProvincia}</td>
</tr>
<tr class="odd">
<td>EstacionesTerrestresHist/FiltroProvinciaProducto/{FECHA}/{IDProvincia}/{IDProducto}</td>
</tr>
<tr class="even">
<td>Listados/ComunidadesAutonomas/</td>
</tr>
<tr class="odd">
<td>Listados/Municipios/</td>
</tr>
<tr class="even">
<td>Listados/MunicipiosPorProvincia/{IDProvincia}</td>
</tr>
<tr class="odd">
<td>Listados/ProductosPetroliferos/</td>
</tr>
<tr class="even">
<td>Listados/Provincias/</td>
</tr>
<tr class="odd">
<td>Listados/ProvinciasPorComunidad/{IDCCAA}</td>
</tr>
<tr class="even">
<td>PostesMaritimos/</td>
</tr>
<tr class="odd">
<td>PostesMaritimos/FiltroCCAA/{IDCCAA}</td>
</tr>
<tr class="even">
<td>PostesMaritimos/FiltroCCAAProducto/{IDCCAA}/{IDProducto}</td>
</tr>
<tr class="odd">
<td>PostesMaritimos/FiltroMunicipio/{IDMunicipio}</td>
</tr>
<tr class="even">
<td>PostesMaritimos/FiltroMunicipioProducto/{IDMunicipio}/{IDProducto}</td>
</tr>
<tr class="odd">
<td>PostesMaritimos/FiltroProducto/{IDProducto}</td>
</tr>
<tr class="even">
<td>PostesMaritimos/FiltroProvincia/{IDProvincia}</td>
</tr>
<tr class="odd">
<td>PostesMaritimos/FiltroProvinciaProducto/{IDProvincia}/{IDProducto}</td>
</tr>
</tbody>
</table>
