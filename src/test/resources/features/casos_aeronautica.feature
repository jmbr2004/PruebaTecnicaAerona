# language: es

@Cucumber
Característica: Validar el estado financiero de un documento PDF 

  esta feature se trata de hacer una busqueda del estado financiero de abril 2021.

  @Regresion
  Escenario: Buscar estado financiero de Abril
    Dado Que "Marcelo" entra a la pagina de Aeronaútica civil
    Cuando "Marcelo" accede a las opciones de Trasparencia, Presupuesto, estados finacieros, Balance y estado situacion finaciera de abril
    Entonces "Marcelo" valida que el PDF sea correcto