// Call the dataTables jQuery plugin
$(document).ready(function() {
    loadEmployee();
  $('#employee').DataTable();
});

async function loadEmployee(){

  const request = await fetch('/employee/getAllObjects', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const employees = await request.json();
  let employeeList = ""

  for (let employee of employees){
  let employeeHtml = "<tr><th>"+employee.Id+"</th><th>"+employee.name+"</th><th>"+employee.address+
                     "</th><th>"+employee.phone+"</th><th>"+employee.cellphone+"</th><th>"+employee.type+
                     "</th><th>"+employee.salary+"</th><th>"+employee.age+"</th><th>"+employee.isLead+
                     "</th><th>"+employee.isManager+"</th><th>"+employee.level+"</th><th>"+employee.status+
                     "</th>th>"+employee.job+"</th><th>"+employee.contacts+"</th></tr>"

  employeeList += employeeHtml
  }

  document.querySelector('#employees tbody').outerHTML = employeeList;

}