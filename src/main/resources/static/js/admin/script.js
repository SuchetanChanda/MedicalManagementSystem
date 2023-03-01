$(document).ready(function () {
  // ADD ACTIVE CLASS TO SIDE MENU ITEMS ON CLICK
  $("#sidebar .side-menu.top li a").click(function (e) {
    e.preventDefault();
    $("#sidebar .side-menu.top li").removeClass("active");
    $(this).parent().addClass("active");
  });

  // TOGGLE SIDEBAR
  $("#content nav .bx.bx-menu").click(function () {
    $("#sidebar").toggleClass("hide");
  });

  // OPEN/CLOSE FORM
  $("#open-form").click(function () {
    $("#myForm").show();
  });
  $("#close-form").click(function () {
    $("#myForm").hide();
  });

  // SWITCH DARK/LIGHT MODE
  $("#switch-mode").change(function () {
    if ($(this).is(":checked")) {
      $("body").addClass("dark");
    } else {
      $("body").removeClass("dark");
    }
  });
});