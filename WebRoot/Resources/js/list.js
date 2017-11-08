function deleteBatch(basePath) {
	$("#mainForm").attr("action",basePath + "DeleteBatch.action");
	$("#mainForm").submit();
}

function deleteConfirm() {
	if (confirm("confirm")) {
		return true;
	} else {
		return false;
	}
}