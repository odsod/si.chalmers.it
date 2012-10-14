function drawVisualization() {
  // Create and populate the data table.
  var data = google.visualization.arrayToDataTable([
    ['Amne', 'Andel'],
    ['Rekursion', 0.708],
    ['Matte', 1.342],
    ['Diskutera', 1.1],
    ['Swing', 2.62],
    ['Klasser', 1.23]
  ]);

  // Create and draw the visualization.
  new google.visualization.PieChart(document.getElementById('visualization')).
      draw(data, {title:"Vad kommer pa tentan?"});
}
