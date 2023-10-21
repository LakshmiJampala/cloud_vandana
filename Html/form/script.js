document.getElementById("survey-form").addEventListener("submit", function (event) {
    event.preventDefault(); 
    const firstName = document.getElementById("first-name").value;
    const lastName = document.getElementById("last-name").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const genderElements = document.querySelectorAll('input[name="gender"]:checked');
    const gender = [...genderElements].map(el => el.value).join(', ');
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;
    const popupData = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;
    document.getElementById("popup-data").innerHTML = popupData;

    document.getElementById("popup").style.display = "block";
});

document.getElementById("reset-btn").addEventListener("click", function () {
    document.getElementById("survey-form").reset();
});

document.getElementById("close-popup").addEventListener("click", function () {
    document.getElementById("popup").style.display = "none";
    document.getElementById("survey-form").reset();
});
