function drawVisualization() {
  // Create and populate the data table.
  var data = google.visualization.arrayToDataTable([
    ['Uppgiftstyp', 'Andel av tenta'],
    ['Rekursion',  0.11],
    ['Matte',  0.096],
    ['Diskutera',  0.079],
    ['Swing',  0.24],
    ['Klasser',  0.10]
  ]);

  // Create and draw the visualization.
  new google.visualization.BarChart(document.getElementById('visualization')).
      draw(data,
           {title:"Vilken uppgift ger mest poang?",
            width:600, height:400,
            vAxis: {title: "Uppgiftstyp"},
            hAxis: {title: "Total andel av tenta"}}
      );
}
