<?php 

	$errors = "";
	// connect to database
	$db = mysqli_connect("localhost", "root", "", "todo");
/*---------------------------------------------------------------------------------------------------------------------*/
    // insert a quote if submit button is clicked
        function InsertTask($task){
            $query = "INSERT INTO task (task) VALUES ('$task')";
            return ($query);
        }   
        if (isset($_POST['submit'])) {
             	if (empty($_POST['task'])) {
			$errors = "Porfavor Ingresa una tarea";
		}else{
                    mysqli_query($db,InsertTask($_POST['task']));
                    header('location: index.php');
                }
            }
/*---------------------------------------------------------------------------------------------------------------------*/                                       
	// delete task
        function DeleteTask($id){
            $query="DELETE FROM task WHERE id=".$id;
            return ($query);
        }    
	if (isset($_GET['del_task'])) {
		mysqli_query($db, DeleteTask($_GET['del_task']));
		header('location: index.php');
	}
/*---------------------------------------------------------------------------------------------------------------------*/
	//COMPLETE TASK
// insert a quote if submit button is clicked
        function CompleteTask($task){
            $query = "INSERT INTO com (task) VALUES ('$task')";
            return($query);
        } 
    if (isset($_POST['cel_task'])) {
        mysqli_query($db, CompleteTask($_POST['task']));
        header('location: index.php');
    }
//        if (isset($_POST['cel_task'])) {
//            $task = $_POST['task'];
//            $query = "INSERT INTO com (task) VALUES ('$task')";
//            mysqli_query($db, $query);
//            header('location: index.php');
//	}
/*---------------------------------------------------------------------------------------------------------------------*/
// select all tasks if page is visited or refreshed
        function ShowTasks(){
            $query = "SELECT * FROM task";
            return($query);
        }
	$tasks = mysqli_query($db, ShowTasks());
	

?>
<!DOCTYPE html>
<html>

<head>
	<title>ToDo List Application PHP and MySQL</title>
	<link rel="stylesheet" type="text/css" href="../other/style.css">
</head>

<body>

	<div class="heading">
		<h2 style="font-style: 'Hervetica';">MyLista</h2>
	</div>


	<form method="post" action="index.php" class="input_form">
		<?php if (isset($errors)) { ?>
			<p><?php echo $errors; ?></p>
		<?php } ?>
		<input type="text" name="task" class="task_input">
		<button type="submit" name="submit" id="add_btn" class="add_btn">Agregar Tarea</button>
	</form>


	<table>
		<thead>
			<tr>
				<th>N</th>
				<th>Tasks</th>
				<th style="width: 60px;">Action</th>
			</tr>
		</thead>

		<tbody>
			<?php $i = 1; while ($row = mysqli_fetch_array($tasks)) { ?>
				<tr>
					<td> <?php echo $i; ?> </td>
					<td class="task"> <?php echo $row['task']; ?> </td>
					<td class="delete"> 
						<a href="index.php?del_task=<?php echo $row['id'] ?>">x</a>
                                                <a href="index.php?cel_task=<?php echo $row['id'] ?>">c</a>
                    </td>
				</tr>
			<?php $i++; } ?>	
		</tbody>
	</table>

</body>
</html>