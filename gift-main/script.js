function showBirthdayMessage() {
  document.getElementById("birthdayMessage").style.display = "block";
  document.getElementById("birthdayImage").style.display = "block";
}

document.getElementById("birthdayButton").addEventListener("click", showBirthdayMessage);
